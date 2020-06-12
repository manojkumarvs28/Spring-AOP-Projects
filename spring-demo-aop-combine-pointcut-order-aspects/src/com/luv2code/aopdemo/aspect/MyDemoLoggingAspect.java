package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.dao.AccountDAO;


@Aspect
@Component
@Order(40)
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	public void setter() {};
	
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	public void forPackage() {};
	
	@Pointcut("forPackage() && !(getter() || setter())")
	public void forCustomPackage() {}


	@Before("forCustomPackage()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("Executing @Before Advice on add account");
		System.out.println(joinPoint.getSignature());
		for(Object arg: joinPoint.getArgs()) {
			 System.out.println(arg);
			//if(arg instanceof AccountDAO) {
		    //  AccountDAO theaccount =(AccountDAO) arg;
		    //  System.out.println("Acc name="+ theaccount.getName());
		    //  System.out.println("Acc ="+ theaccount.get);
			//}
			
		}
	}
	
}

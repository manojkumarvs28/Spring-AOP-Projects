package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


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
	public void beforeAddAccountAdvice() {
		System.out.println("Executing @Before Advice on add account");
	}
	
}

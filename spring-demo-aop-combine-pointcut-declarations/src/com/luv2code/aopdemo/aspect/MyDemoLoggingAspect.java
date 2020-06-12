package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
	private void setter() {};
	
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	@Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
	private void forPackage() {};
	
	@Pointcut("forPackage() && !(getter() || setter())")
	private void forCustomPackage() {}


	@Before("forCustomPackage()")
	public void beforeAddAccountAdvice() {
		System.out.println("Executing @Before Advice on add account");
	}
	
}

package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {

	@Before("com.luv2code.aopdemo.aspect.MyDemoLoggingAspect.forCustomPackage()")
	public void MyAPIAnalyticsAspect() {
		System.out.println("Inside cloud log aspect");
	}
	
}

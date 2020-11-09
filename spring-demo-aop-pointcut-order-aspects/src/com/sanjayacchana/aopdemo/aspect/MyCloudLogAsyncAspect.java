package com.sanjayacchana.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {
	
	@Before("com.sanjayacchana.aopdemo.aspect.AopExpressionsDefinations.forDaoPackageNoSetterGetter()")
	public void logCloudAsyncAspects() {
		System.out.println("======> Logging Cloud Async Aspects here");
	}

}

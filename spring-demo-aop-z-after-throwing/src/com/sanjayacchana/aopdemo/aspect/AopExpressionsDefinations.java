package com.sanjayacchana.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressionsDefinations {
	
	//decalre pointcut expression which enables us to use in multiple places
	@Pointcut("execution(* com.sanjayacchana.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
		
	//create a pointcut for setter methods
	@Pointcut("execution(* com.sanjayacchana.aopdemo.dao.*.set*(..))")
	public void setter() {}
		
	//create a pointcut for getter methods
	@Pointcut("execution(* com.sanjayacchana.aopdemo.dao.*.get*(..))")
	public void getter() {}
		
	//create pointcut: include forDaoPackage() , exclude setter() and getter()
	@Pointcut("forDaoPackage() && !(setter() || getter())")
	public void forDaoPackageNoSetterGetter() {}
	
}

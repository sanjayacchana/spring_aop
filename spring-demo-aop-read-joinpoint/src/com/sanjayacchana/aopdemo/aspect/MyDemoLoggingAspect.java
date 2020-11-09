package com.sanjayacchana.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sanjayacchana.aopdemo.dao.AccountDao;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	@Before("com.sanjayacchana.aopdemo.aspect.AopExpressionsDefinations.forDaoPackageNoSetterGetter()")
	public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("======> Executing @Before Advice on beforeAddAccountAdvice()");
		
		//display the method signature
		MethodSignature theMethodSignature = (MethodSignature) theJoinPoint.getSignature();
		System.out.println("Method Signature: "+theMethodSignature);
		
		//display method aruguments
		Object[] args = theJoinPoint.getArgs();
		
		for(Object objArg: args) {
			System.out.println(objArg);
			if(objArg instanceof AccountDao) {
				
				//downcast and print account specific stuff
				AccountDao theAccountDao = (AccountDao) objArg;
				
				System.out.println("Account Name: "+theAccountDao.getName());
				System.out.println("Account ServiceCode: "+ theAccountDao.getServiceCode());
			}
		}
		
	}

}

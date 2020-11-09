package com.sanjayacchana.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.sanjayacchana.aopdemo.Account;
import com.sanjayacchana.aopdemo.dao.AccountDao;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	
	@AfterThrowing(
			pointcut="execution(* com.sanjayacchana.aopdemo.dao.AccountDao.findAccounts(..))",
			throwing = "theException"
			)
	public void afterThrowingFindAccountAdvice(JoinPoint theJoinPoint, Throwable theException) {
		
		//print out the method we are advicing on
		String method =theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====> Executing @AfterThrowing on method: "+method);
		
		//print out logging exception
		System.out.println("Exception: "+theException);
		
	}
	
	//add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(
			pointcut="execution(* com.sanjayacchana.aopdemo.dao.AccountDao.findAccounts(..))",
			returning = "result"
			)
	public void afterReturningFindAccountAdvice(JoinPoint theJoinPoint,List<Account> result) {
		
		
		//print out the method we are advicing on
		String method =theJoinPoint.getSignature().toShortString();
		System.out.println("\n=====> Executing @AfterReturning on method: "+method);
		
		//print out the results of method call
		System.out.println("\n====> Results: "+ result);
		
		//let's post process the data ... let's modify it
		
		convertAccountNamesToUpperCase(result);
		
		System.out.println("\n====> Results: "+ result);
		
		
	}
	

	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		for(Account tempAccount: result) {
			
			String theUpperCaseAccountName = tempAccount.getName().toUpperCase();
			
			tempAccount.setName(theUpperCaseAccountName);
		}
	}


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

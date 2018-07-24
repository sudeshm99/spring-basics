package com.spring.micro.services.demo.test.service.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//AOP
//configuration
@Aspect 
@Configuration
public class CheckForUserAccessAspect {
	private Logger LOGGER = LoggerFactory.getLogger(CheckForUserAccessAspect.class);
	
	// what kind of method call will be intercept 
	// execution(* package.*.*(..))  com.spring.micro.services.demo.test.service.business.Business2.getService2()
	@Before("com.spring.micro.services.demo.test.service.aspect.CommanJoinPointConfig.dataLayerExecution()")
	public void beforeFun(JoinPoint joinPoint){
		LOGGER.info("check for user access");
		LOGGER.info("Allowed access for user");
		LOGGER.info("Intercept method call - {}",joinPoint);
	}
	
	@AfterReturning(value = "com.spring.micro.services.demo.test.service.aspect.CommanJoinPointConfig.dataLayerExecution()", returning="result")
	public void afterReturnFun(JoinPoint joinPoint, Object result){
		LOGGER.info("++++++++++++++++++++++++++++++++++++++++++++");
		LOGGER.info("++++++++++++++++++++++++++++++++++++++++++++");
		LOGGER.info("++++++++++++++++++++++++++++++++++++++++++++");
		LOGGER.info("After returnign join point - {} and return value - {}",joinPoint,result);
	}
	
	@AfterThrowing(value = "com.spring.micro.services.demo.test.service.aspect.CommanJoinPointConfig.dataLayerExecution()", throwing="exception")
	public void afterThrowingFun(JoinPoint joinPoint, Object exception){
		LOGGER.info("-----------------------------------------------");
		LOGGER.info("-----------------------------------------------");
		LOGGER.info("-----------------------------------------------");
		LOGGER.info("After returnign join point - {} and exception occered exception - {}",joinPoint,exception);
	}
	
	@After(value = "com.spring.micro.services.demo.test.service.aspect.CommanJoinPointConfig.businessLayerExecution()")
	public void afterFun(JoinPoint joinPoint){
		LOGGER.info("_+_+_+_+_+___+_+__+__+__+_+_+__+_+_+_+_+_+_+_+_+_");
		LOGGER.info("_+_+_+_+_+___+_+__+__+__+_+_+__+_+_+_+_+_+_+_+_+_");
		LOGGER.info("_+_+_+_+_+___+_+__+__+__+_+_+__+_+_+_+_+_+_+_+_+_");
		LOGGER.info("After join point - {}",joinPoint);
	}		
}

	package com.spring.micro.services.demo.test.service.aspect;

	import org.aspectj.lang.JoinPoint;
	import org.aspectj.lang.ProceedingJoinPoint;
	import org.aspectj.lang.annotation.After;
	import org.aspectj.lang.annotation.AfterReturning;
	import org.aspectj.lang.annotation.AfterThrowing;
	import org.aspectj.lang.annotation.Around;
	import org.aspectj.lang.annotation.Aspect;
	import org.aspectj.lang.annotation.Before;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.context.annotation.Configuration;

	//AOP
	//configuration
	@Aspect 
	@Configuration
	public class MethodExcecutionCalcAspect {
		private Logger LOGGER = LoggerFactory.getLogger(MethodExcecutionCalcAspect.class);
		
		// what kind of method call will be intercept 
		// execution(* package.*.*(..))  com.spring.micro.services.demo.test.service.business.Business2.getService2()
		@Around("com.spring.micro.services.demo.test.service.aspect.CommanJoinPointConfig.dataLayerExecution()")
		public void checkMethodProforFun(ProceedingJoinPoint joinPoint) throws Throwable{
			// get start time
			// allow to execute method
			// get end time
			// calculate time difference 
			long startTime = System.currentTimeMillis();
			joinPoint.proceed();
			long currentTime = System.currentTimeMillis()-startTime;
			LOGGER.info("Time --- {} take by method --- {}",currentTime,joinPoint);
		}	
	}

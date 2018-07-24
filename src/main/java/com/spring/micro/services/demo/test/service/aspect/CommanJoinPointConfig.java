package com.spring.micro.services.demo.test.service.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommanJoinPointConfig {
	@Pointcut("execution(* com.spring.micro.services.demo.test.service.business.*.*(..))")
	public void dataLayerExecution(){};
	
	@Pointcut("execution(* com.spring.micro.services.demo.test.service.data.*.*(..))")
	public void businessLayerExecution(){};
}

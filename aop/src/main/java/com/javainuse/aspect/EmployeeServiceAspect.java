package com.javainuse.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class EmployeeServiceAspect {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceAspect.class);
	
	


	@Around("execution(* com.javainuse.service.EmployeeService.*(..)) and args(CEP)")
	public Object logAroundGetConsultaCep(ProceedingJoinPoint joinPoint, String CEP) throws Throwable {
		    LOGGER.info("INFO : ****CepAspect.logAroundGetConsultaCep() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
	        
		    try {
	        	
	        	Object result = joinPoint.proceed();
	            LOGGER.info("INFO : "+ joinPoint.getSignature().getName());
	            
	            LOGGER.info("WARN : Inside RunAfterExecution.afterReturning() method...");
	            LOGGER.info("WARN : Running after advice...");
	           
	           
	            return result;
	        }catch(Exception ne){
	        	 
	        	 LOGGER.error("INF O: falhou cep");
	            throw ne;
	        
	        	
	        }
    }
}

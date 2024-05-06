package com.itbank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class TestAOP {	
	
	private static Logger log = LoggerFactory.getLogger(TestAOP.class);
	
	@Around("execution(* com.itbank.service.*.*(..))")
	public Object useTime(ProceedingJoinPoint jp) throws Throwable {
		// throwable >> exception
		long begin = System.currentTimeMillis();
				
		Object result = jp.proceed(jp.getArgs());
		// join point이다
		
		long end = System.currentTimeMillis();
		
		String msg = jp.getSignature().getName();
		
		// System.out.println("소요 시간 : " + (end - begin) / 1000.0);
		
		msg += "소요시간 : " + (end - begin) / 1000.0 + "초";
        
        log.debug(msg);
        // 보기 싫을때 log 레벨을 올린다
		
		return result;
	}
	
}

package aop09;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 공통, 횡단.
@Component
@Aspect
public class CalcAdvice {

	@Before("execution(public void aop09.*.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("연산을 시작합니다.");
	}
	@After("execution(public void aop09.*.*(..))")
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("연산을 종료합니다.");
	}
	
}

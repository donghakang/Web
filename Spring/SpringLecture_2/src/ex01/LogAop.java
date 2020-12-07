package ex01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("execution(public void ex01.*.*())")
	public void myPointCut() {
		
	}
	@Before("myPointCut()")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("핵심 기능 전에 실행 할 공통 기능");
	}
	
	@After("myPointCut()")
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("핵심 기능 후에 실행 할 공통 기능");
	}
}

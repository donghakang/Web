package aop06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component			// bean을 만든다. 기본값: @Component ==> bean이름: myAspect
@Aspect
public class MyAspect {
	@Pointcut("execution(public void aop06.*.*())")
	public void myWork() {
		
	}
	
	@Before("myWork()")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("로그인 처리");
	}
	
	@After("myWork()")
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("로그아웃 처리");
	}
}

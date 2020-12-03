package aop03;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("로그인 처리");
	}
	
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("로그아웃 처리");
	}
}

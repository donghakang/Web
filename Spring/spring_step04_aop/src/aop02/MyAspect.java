package aop02;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("로그인 처리!");

		try {
			invocation.proceed();
		} catch (Exception e) {
			System.out.println("예외 발생!");
		}

		System.out.println("로그아웃 처리!");

		return null;
	}

}

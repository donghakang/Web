package sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("sample1/beans2.xml");
		System.out.println("** Container 초기화 작업 **");
		
		MessageBean bean = (MessageBean)factory.getBean("messageBean");
		bean.sayHello();						// 주입 (DI)
		bean.sayHello("mango", 7500);			// 대입 
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}

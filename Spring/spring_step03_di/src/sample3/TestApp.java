package sample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("sample3/app.xml");
		
		//AbstractTest bean=(AbstractTest)factory.getBean("test");
		AbstractTest bean=factory.getBean("test", AbstractTest.class);
		System.out.println("오늘은 "+bean.dayInfo());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}










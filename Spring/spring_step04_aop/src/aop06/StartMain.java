package aop06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop06/applicationContext.xml");
		
		Person p = (Person)context.getBean(args[0]);
		p.work();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop02/applicationContext.xml");
		
		Person p = (Person)context.getBean("customer");
		p.work();
		
		p = (Person)context.getBean("emp");
		p.work();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

package ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex01/bean.xml");
		
		Cats myCat = context.getBean("myCat",Cats.class); 
		myCat.getCatsInfo();
		
		((ClassPathXmlApplicationContext)context).close();
	}	
}

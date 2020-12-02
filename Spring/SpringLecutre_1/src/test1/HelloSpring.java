package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("test1/bean.xml");
		
		Calc bean = (Calc)context.getBean("add");
		System.out.println(bean.toString());
		
		bean = context.getBean("mul", Calc.class);
		System.out.println(bean.toString());
	
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

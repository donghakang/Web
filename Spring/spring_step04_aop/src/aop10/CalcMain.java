package aop10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop06.Person;

public class CalcMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop9/applicationContext.xml");
		
		CalcMethod calc = context.getBean("calc", CalcMethod.class);
		calc.sum(5,4);
		calc.div(2,0);
		
		((ClassPathXmlApplicationContext)context).close();
	}	
}

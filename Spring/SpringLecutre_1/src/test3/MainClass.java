package test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test2.SungJuk;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test3/bean.xml");
		
		MyCats myCat = factory.getBean("myCats", MyCats.class);
		myCat.catNameInfo();
		myCat.catAgeInfo();
		
		((ClassPathXmlApplicationContext) factory).close();
	}
}

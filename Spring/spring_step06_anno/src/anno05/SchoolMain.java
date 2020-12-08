package anno05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anno05.School;

public class SchoolMain {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("anno05/bean.xml");
        
		School sh=(School)factory.getBean("mySchool");
		System.out.println(sh.toString());
		
		((ClassPathXmlApplicationContext)factory).close();		
	}
}


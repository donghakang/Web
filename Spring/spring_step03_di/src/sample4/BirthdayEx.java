package sample4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BirthdayEx {
	
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("sample4/date.xml");
		
		DateVo ob1 = factory.getBean("hong", DateVo.class);
		DateVo ob2 = factory.getBean("lee", DateVo.class);
		
		System.out.println(ob1.toString());
		System.out.println(ob2.toString());
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}

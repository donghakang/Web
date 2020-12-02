package test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test2/bean.xml");
		System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		SungJuk bean = (SungJuk)context.getBean("sungjuk");
		System.out.println(bean.toString());
		
		((ClassPathXmlApplicationContext) context).close();
	}

}

package sample5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("sample5/applicationContext2.xml");
		System.out.println("** End **");
		
		MessageBean bean=(MessageBean)factory.getBean("messageBean");
		bean.helloCall();
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}
/*
[출력결과]
 
1.Bean의 생성자 호출 
2.파일 경로와 파일 이름 설정
3.phone입력받음
4.outputter를 입력받음
** End **
이순신:123-4567
5.파일전송성공
6.작업끝
*/








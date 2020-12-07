package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test01/applicationContext.xml");
		
		FirstJdbcDao dao = context.getBean("test", FirstJdbcDao.class);
		int count = dao.insert("p0004", "Ajax", 34000, "제이펌");
		if (count > 0) {
			System.out.println(count + "행 데이터가 입력되었습니다.");	
		}
		
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

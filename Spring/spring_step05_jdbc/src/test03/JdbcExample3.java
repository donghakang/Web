package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample3 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		FirstJdbcDao dao = context.getBean("test", FirstJdbcDao.class);
		int count = dao.delete("스프링");
		if (count > 0) {
			System.out.println(count + "행 데이터가 삭제되었습니다.");	
		}
		
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

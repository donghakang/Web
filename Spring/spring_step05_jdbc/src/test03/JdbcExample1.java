package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample1 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		FirstJdbcDao dao = context.getBean("test", FirstJdbcDao.class);
		dao.execute("SELECT * FROM GOODSINFO");
				
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

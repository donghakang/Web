package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test03.FirstJdbcDao;

public class JdbcExample5 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		FirstJdbcDao dao = context.getBean("test", FirstJdbcDao.class);
		
		GoodsEntity entity = dao.findGoods("p0001");
		
		if (entity != null) {
			System.out.println(entity.getCode() + "\t" + entity.getName() + "\t" + entity.getPrice() + "\t" + entity.getMaker());
			
		}
		
		((ClassPathXmlApplicationContext)context).close();
	}
}

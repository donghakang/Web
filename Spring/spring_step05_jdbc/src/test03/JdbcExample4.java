package test03;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test03.FirstJdbcDao;

// 전체보기
public class JdbcExample4 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");

		FirstJdbcDao dao = context.getBean("test", FirstJdbcDao.class);
		List<GoodsEntity> list = dao.listGoods();

		for (GoodsEntity entity : list) {
			System.out.print("코드:" + entity.getCode() + "\t");
			System.out.print("책이름:" + entity.getName() + "\t");
			System.out.print("가격:" + entity.getPrice() + "\t");
			System.out.print("출판사:" + entity.getMaker() + "\n");
		}
		((ClassPathXmlApplicationContext) context).close();
	}
}

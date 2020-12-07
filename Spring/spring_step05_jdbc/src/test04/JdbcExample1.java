package test04;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test03.FirstJdbcDao;

public class JdbcExample1 {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		SqlSession session = SqlMapClientFactory.getSqlMapClientInstance().openSession();
		List<GoodsEntity> list = session.selectList("mybatis.goodsMapper.listGoods");

		System.out.println("교재코드    교재   가격   출판사");
		System.out.println("---------------------------");
		for (GoodsEntity entity : list) {
			System.out.print("코드 : " + entity.getCode() + "\t");
			System.out.print("책이름 : " + entity.getName() + "\t");
			System.out.print("가격 : " + entity.getPrice() + "\t");
			System.out.print("출판사 : " + entity.getMaker() + "\n");
		}

		session.close();
	}
}

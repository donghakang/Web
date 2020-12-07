package test04;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcExample2 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test04/beans.xml");
		SqlSession session = SqlMapClientFactory.getSqlMapClientInstance().openSession();
		
		GoodsEntity entity = factory.getBean("entity1", GoodsEntity.class);
		
		try {
			int n = session.insert("mybatis.goodsMapper.insertGoods", entity);
			
			if (n > 0 ) { 
				session.commit();
				System.out.println(n + "행 데이터를 추가했습니다 . ");
			}
			
			
		} catch(Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
		
		((ClassPathXmlApplicationContext)factory).close();
		
	}
}

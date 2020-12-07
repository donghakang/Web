package test04;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*  수정
[문제] p0001을  R프로그래밍, 15000, 남가람북스로 변경하시오

[결과] 상품 1개를 수정하였습니다
 */
public class JdbcExample6 {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("test04/beans.xml");
		
		GoodsEntity entity = factory.getBean("entity2", GoodsEntity.class);
		SqlSession session = SqlMapClientFactory.getSqlMapClientInstance().openSession();
		
		try {
			int cnt = session.update("mybatis.goodsMapper.updateGoods", entity);
			if(cnt > 0) {
				System.out.println("상품 " + cnt + "개를 수정하였습니다.");
				session.commit();
			}
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}
		
		((ClassPathXmlApplicationContext)factory).close();
	}
}

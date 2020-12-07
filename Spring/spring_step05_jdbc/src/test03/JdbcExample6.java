package test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test03.FirstJdbcDao;
/*  수정
[문제] p0001을  jQuery, 35000, 인포믹스로 변경하시오

[결과] 상품 1개를 수정하였습니다
 */
public class JdbcExample6 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("test03/applicationContext.xml");
		
		GoodsEntity entity = new GoodsEntity();
		entity.setCode("p0001");
		entity.setName("jQuery");
		entity.setPrice(35000);
		entity.setMaker("인포믹스");
		
		
		FirstJdbcDao dao = context.getBean("test", FirstJdbcDao.class);
		int n = dao.update(entity);
		
		if (n > 0) {
			System.out.println("수정 완료");
		}
		((ClassPathXmlApplicationContext)context).close();
	}
}

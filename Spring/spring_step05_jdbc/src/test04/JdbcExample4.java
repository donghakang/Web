package test04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;

//복수 조건으로 검색
//[문제] 코드에  "p0"가 포함되어 있으며, 금액이 43000원을 미만이고, 출판사가 "인포믹스" 상품을 검색하시오
//select * from goodsinfo where code='p0001';
//select * from goodsinfo where code like '%p0%'
public class JdbcExample4 {
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<>();
		map.put("code", "%" + "p0" + "%");
		map.put("price", 43000);
		map.put("maker", "인포믹스");
		
		SqlSession session=SqlMapClientFactory.getSqlMapClientInstance().openSession();
		
		List<GoodsEntity> goodsList=session.selectList("mybatis.goodsMapper.selectGoodsByCodeAndPriceAndMaker", map);
		System.out.println("   상품코드     상품명 \t\t  가격   \t제조사");
		System.out.println("-------------------------------------------------------");
		
		for(GoodsEntity entity : goodsList)
		{
			System.out.print("코드 : " + entity.getCode() +"\t");
			System.out.print("책이름 : " + entity.getName() +"\t");
			System.out.print("가격 : " + entity.getPrice() +"\t");
			System.out.print("출판사 : " + entity.getMaker() +"\n");
		}
		session.close();		
	}
}

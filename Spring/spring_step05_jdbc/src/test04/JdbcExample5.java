package test04;

import org.apache.ibatis.session.SqlSession;

public class JdbcExample5 {
	public static void main(String[] args) {
		SqlSession session = SqlMapClientFactory.getSqlMapClientInstance().openSession();

		GoodsEntity entity = session.selectOne("mybatis.goodsMapper.findGoods", args[0]);

		if (entity != null) {
			System.out.println(entity.getCode() + "    " + entity.getName() + "   " + entity.getPrice() + "    "
					+ entity.getMaker());
		}
		session.close();
	}
}

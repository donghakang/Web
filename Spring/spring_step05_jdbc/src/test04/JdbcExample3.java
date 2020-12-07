package test04;

import org.apache.ibatis.session.SqlSession;

public class JdbcExample3 {
	public static void main(String[] args) {
		SqlSession session = SqlMapClientFactory.getSqlMapClientInstance().openSession();

		int n = session.delete("mybatis.goodsMapper.deleteGoods", args[0]);
		
		try {
			
			if (n > 0) {
				session.commit();
				System.out.println(args[0] + "교재가" + n + "권 삭제되었습니다. ");
			}

		} catch (Exception e) {
			System.out.println("실패!");
			session.rollback();
		} finally {
			session.close();
		}
	}
}

package dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Product;

public class ProductDao {

	private static SqlSessionFactory factory;

	static {
		try {
			String resource = "mybatis/myBatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
			// default에 연결 (environment id="dev")
			// factory=new SqlSessionFactoryBuilder().build(reader, "env");
			// environment id="env"에 연결
		} catch (IOException e) {
			System.out.println("Not working");
			e.printStackTrace();
		}
	}

	public boolean insertProduct(Product product) {
		SqlSession session = factory.openSession();
		int n = 0;
		try {
			n = session.insert("my.productMapper.insertProduct", product);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {

			session.close();
		}

		if (n > 0)
			return true;
		else
			return false;
	}

	public List<Product> listProduct() {
		SqlSession session = factory.openSession();
		List<Product> list = null;
		try {
			list = session.selectList("my.productMapper.listProduct");
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}

		return list;
	}

	public boolean deleteProduct(int no) {
		SqlSession session = factory.openSession();
		int n = 0;
		try {
			n = session.delete("my.productMapper.deleteProduct", no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}

		if (n > 0)
			return true;
		else
			return false;
	}

	public Product getProduct(int no) {
		SqlSession session = factory.openSession();
		Product product = null;
		try {
			product = session.selectOne("my.productMapper.selectProduct", no);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}

		return product;
	}

	public boolean updateProduct(Product product) {
		SqlSession session = factory.openSession();
		int n = 0;
		try {
			n = session.update("my.productMapper.updateProduct", product);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		} finally {
			session.close();
		}

		if (n > 0)
			return true;
		else
			return false;
	}

	public List<Product> searchProduct(Map<String, Object> map) {
		SqlSession session = factory.openSession();
		List<Product> list = session
				.selectList("my.productMapper.searchProduct", map);
		session.close();
		return list;
	}

}

//// -----------------------------------------------------
// public List<Emp> getList() {
// SqlSession session = factory.openSession();
// List<Emp> list = session.selectList("my.empMapper.listEmp");
// session.close();
// return list;
// }
//
// public int updateEmp(Emp ob) {
// SqlSession session = factory.openSession();
// int n = 0;
//
// try {
// n = session.update("my.empMapper.updateEmp", ob);
// session.commit();
//
// } catch (Exception e) {
// session.rollback();
// e.printStackTrace();
// } finally {
// session.close();
// }
//
// return n;
// }
// public int deleteEmp(int eno) {
// SqlSession session = factory.openSession();
// int n = 0;
//
// try {
// n = session.insert("my.empMapper.deleteEmp", eno);
// session.commit();
// } catch (Exception e) {
// session.rollback();
// } finally {
// session.close();
// }
//
// return n;
// }
// public Emp searchNo(int eno) {
// SqlSession session = factory.openSession();
// Emp emp = new Emp();
//
// try {
// emp = session.selectOne("my.empMapper.searchEmp", eno);
// session.commit();
// } catch (Exception e) {
// session.rollback();
// e.printStackTrace();
// } finally {
// session.close();
// }
//
// return emp;
// }
// public List<Emp> getEmpByEnoAndDept(Map<String, Object> map) {
// SqlSession session = factory.openSession();
// List<Emp> list = session.selectList("my.empMapper.searchEmp", map);
// session.close();
// return list;
// }
// }
/// *
// * insert: 추가 update: 수정 delete: 삭제 select(=selectList): 여러건의 객체 selectOne:
//// 1건의
// * 객체
// */

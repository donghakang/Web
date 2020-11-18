package dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import entity.Emp;

//DAO(Data Access Object):데이터베이스와 연동
public class EmpDao {
	private static SqlSessionFactory factory;
	
	static {
		try {
			String resource="mybatis/myBatis-config.xml";
			Reader reader=Resources.getResourceAsReader(resource);
			factory=new SqlSessionFactoryBuilder().build(reader);
			                         //default에 연결 (environment id="dev")
//			factory=new SqlSessionFactoryBuilder().build(reader, "env");
			                         // environment id="env"에 연결
		}catch(IOException e) {}
	}
	//----------------------------------------------------------------------
	public int insertEmp(Emp ob) {
		SqlSession session=factory.openSession();
		int n=0;
		
		try {				 //namespace: my.empMapper , id명:insertEmp								
			n=session.insert("my.empMapper.insertEmp",ob);
			session.commit();
		}catch(Exception e) {
			session.rollback();
		}finally {
			session.close();
		}
		return n;
	}
	//-----------------------------------------------------
	public List<Emp> getList() {
		SqlSession session=factory.openSession();
		List<Emp> list=session.selectList("my.empMapper.listEmp");
		session.close();
		return list;
	}
}
/*
	insert: 추가
	update: 수정
	delete: 삭제
	select(=selectList): 여러건의 객체
	selectOne: 1건의 객체
*/














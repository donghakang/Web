package com.login.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.login.dto.LoginDTO;

public class LoginDAO {
	private static SqlSessionFactory factory;

	static {
		try {
			String resource = "mybatis/mybatis-config.xml";
			System.out.println(resource);
			Reader reader = Resources.getResourceAsReader(resource);
			System.out.println(reader);
			factory = new SqlSessionFactoryBuilder().build(reader);
			System.out.println("DD");
		} catch (IOException e) {
			System.out.println("EE");
		}
	}
	// ----------------------------------------------------------------------
	public LoginDTO getLoginUser(String id, String pwd) {
		SqlSession session = factory.openSession();
		LoginDTO dto = new LoginDTO(id, pwd, "", 0);
		LoginDTO entity = session.selectOne("mybatis.LoginMapper.getLoginUser",
				dto);
		session.close();
		return entity;
	}
}

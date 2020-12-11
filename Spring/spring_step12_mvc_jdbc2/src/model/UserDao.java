package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import entity.User;

@Repository("userDao")
public class UserDao {
	@Autowired
	private SqlSessionFactory factory;
	
	public boolean insertUser(User user) {
		int n=factory.openSession().insert("my.userMapper.inserUser",user);
		return (n > 0)?true:false;
	}
	//--------------------------------------------------------
	public List<User> listUser() {
		return factory.openSession().selectList("my.userMapper.listUser");
	}
}


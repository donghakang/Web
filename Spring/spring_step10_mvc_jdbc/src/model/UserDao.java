package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import entity.User;

@Repository("userDao")
public class UserDao {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}
	//--------------------------------------------------------
	public boolean insertUser(User user) {
		int n=jdbcTemplate.update("INSERT INTO USER1(NAME,AGE,HOBBY) VALUES(?,?,?)",
				         new Object[] {user.getName(),user.getAge(),user.getHobby()});
		return (n > 0)?true:false;
	}
	public List<User> listUser() {
		List<User> list = jdbcTemplate.query("SELECT * FROM USER1", new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User ob = new User();
				ob.setName(rs.getString("NAME"));
				ob.setAge(rs.getInt("AGE"));
				ob.setHobby(rs.getString("HOBBY"));
				return ob;
			}
		});
		return list;
	}

}

package com.biz;

import com.dao.LoginDAO;
import com.entity.User;

public class LoginBiz {

	public User getLoginUser(String id, String pw) {

		LoginDAO dao = new LoginDAO();
		User user = dao.getLoginUser(id, pw);
		return user;
	}

}

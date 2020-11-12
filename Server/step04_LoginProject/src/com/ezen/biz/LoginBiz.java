package com.ezen.biz;

import com.ezen.dao.LoginDao;
import com.ezen.entity.LoginEntity;

public class LoginBiz {

	public LoginEntity getLoginUser(String id, String pwd) {
		LoginDao dao = new LoginDao();
		LoginEntity entity = dao.getLoginUser(id, pwd);
		return entity;
	}

}

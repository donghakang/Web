package com.ezen.biz;

import com.ezen.dao.LoginDao;
import com.ezen.entity.LoginEntity;

//유효성검사 또는 계산처리 담당
public class LoginBiz {

	public LoginEntity getLoginUser(String id, String pwd) {
		LoginDao dao=new LoginDao();
		LoginEntity entity=dao.getLoginUser(id,pwd);
		return entity;
	}

}

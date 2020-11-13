package book.biz;

import book.dao.LoginDAO;

public class LoginBiz {

	public LoginBiz() {
		super();
	}

	public boolean getLoginUser(String id, String pass) {
		LoginDAO dao = new LoginDAO();
		boolean log = dao.getLoginUser(id, pass);

		return log;
	}

}

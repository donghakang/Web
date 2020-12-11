package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.User;
import model.UserService;

@Controller
public class UserController {
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	//추가하기(화면)-------------------------------------
	@RequestMapping("/insert.do")
	public ModelAndView insert() {
		return new ModelAndView("insert");		// /WEB-INF/view/inser.jsp --> applicationContext.xml이 처리해버린
	}
	
	//추가하기(데이터 추가)--------------------------------
	@RequestMapping("/insertProc.do")
	public ModelAndView insertProc(@ModelAttribute User user) {
//		System.out.println("이름:" + user.getName());
		
		if(userService.insertUser(user) == true) {
			System.out.println("ok");
			return list();
		}else {
			return new ModelAndView("insert");
		}
	}
	
	//전체 출력하기 --------------------------------------
	@RequestMapping("/list.do")
	public ModelAndView list() {
		return new ModelAndView("list", "list", userService.listUser());
								// viewName, modelName, modelObject
								// list.jsp, request객체이름, 전달할 객체 
	}
}
/* 
@ModelAttribute User user는 아래와 동일
User user = new User();
user.setName(request.getParameter("name"))
user.setAge(request.getParameter("age"))
user.setHobby(request.getParameter("hobby"))
*/











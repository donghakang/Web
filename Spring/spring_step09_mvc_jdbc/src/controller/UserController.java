package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String insert() {
		return "/WEB-INF/view/insert.jsp";
	}
	
	//추가하기(데이터 추가)--------------------------------
	@RequestMapping("/insertProc.do")
	public String insertProc(@ModelAttribute User user) {
//		System.out.println("이름:" + user.getName());
		
		if(userService.insertUser(user) == true) {
			System.out.println("ok");
			return "/list.do";
		}else {
			return "/WEB-INF/view/insert.jsp";
		}
	}
	
	//전체 출력하기 --------------------------------------
	@RequestMapping("/list.do")
	public String list(Model model) {
		model.addAttribute("list", userService.listUser());
		return "/WEB-INF/view/list.jsp";
	}
}
/* 
@ModelAttribute User user는 아래와 동일
User user = new User();
user.setName(request.getParameter("name"))
user.setAge(request.getParameter("age"))
user.setHobby(request.getParameter("hobby"))
*/











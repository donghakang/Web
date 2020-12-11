package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	@RequestMapping(value="/insert.do")
	public String insert() {
		return "insert";		// /WEB-INF/view/insert.jsp를 의미 (applicationContext.xml 참고)
	}
	
	//추가하기(데이터 추가)--------------------------------
	@RequestMapping(value="/insertProc.do", method=RequestMethod.POST)
	public String insertProc(@ModelAttribute User user) {
		
		if(userService.insertUser(user) == true) {
			System.out.println("ok");
			return "redirect:/list.do";			// RequestMapping("/list.do")로 이동한다. 
		}else {
			return "insert";
		}
	}
	
	//전체 출력하기 --------------------------------------
	@RequestMapping(value="/list.do")
	public String list(Model model) {
		List<User> list = userService.listUser();
		model.addAttribute("list", list);
		return "list";
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

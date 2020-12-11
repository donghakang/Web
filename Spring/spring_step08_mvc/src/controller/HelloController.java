package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.HelloService;

@Controller
public class HelloController {
	@Autowired
	HelloService helloService;
	
	@RequestMapping(value="/hello.do")
	public String hello(Model model) {
		model.addAttribute("msg", helloService.getHello());
		return "/WEB-INF/view/hello.jsp";
	}
}

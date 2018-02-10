package masterSpringMvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/")
	public String hello(ModelMap map){
		map.addAttribute("message", "hello world");
		return "resultPage";
	}
}

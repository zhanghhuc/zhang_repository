package ocf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/setJob.do")
	@ResponseBody
	public void setJob(){
		System.out.println("*******************");
	}
}

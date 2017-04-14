package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	
	
   @RequestMapping("/login")
   public String login(@RequestParam(value="username",required=true) String username,@RequestParam(value="password",required=true) String password,Model model) {
	  
	   return null;
   }
   
	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name",required=false,defaultValue="World") String name, Model model) {
		
		model.addAttribute("name",name);
		
		return "greeting";
		
	}
	

}

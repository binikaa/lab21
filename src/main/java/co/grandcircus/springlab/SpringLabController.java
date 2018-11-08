package co.grandcircus.springlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SpringLabController {
	
	
		@RequestMapping("/")
		public ModelAndView index()
		{
			return new ModelAndView("index");
		}
		@RequestMapping("/Registration")
			public ModelAndView showRegister()
			{
				return new ModelAndView("Registration");
			}
		
		
		@RequestMapping("/Summery")
	    public ModelAndView showRegister(@RequestParam("firstname")String Firstname,@RequestParam("lastname")String Lastname
	    ,@RequestParam("email")String Email,@RequestParam("phno")String phoneno,@RequestParam("password")String Password)
		 {
			ModelAndView mv = new ModelAndView("Summery");
			mv.addObject("firstname",Firstname);
			mv.addObject("lastname",Lastname);
			mv.addObject("email",Email);
			mv.addObject("phno",phoneno);
			mv.addObject("password",Password);
			   return mv;
			   
			   
		 }
		
}
		
	    
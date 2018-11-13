package co.grandcircus.springlab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringLabController {
	@Autowired
	private MenuItemDao menuitemdao;
	
	
		@RequestMapping("/")
		public ModelAndView index()
		{
			return new ModelAndView("index");
		}
		@GetMapping("/Registration")
			public ModelAndView showRegister()
			{
				return new ModelAndView("Registration");
			}
		
		@PostMapping("/Registration")
		
			 public ModelAndView showRegister(@RequestParam("firstname")String Firstname,@RequestParam("lastname")String Lastname
					    ,@RequestParam("email")String Email,@RequestParam("phno")Integer Phoneno,@RequestParam("password")String Password)
						 {
							
							Customer customer= new Customer();
							customer.setFirstname(Firstname);
							customer.setLastname(Lastname);
							customer.setEmail(Email);
							customer.setPhno(Phoneno);
							customer.setPassword(Password);
							ModelAndView mv = new ModelAndView("Registration");
							 mv.addObject("Customer",customer);
							 return mv;		
							
						   
						 }
		
		@RequestMapping("/Summery")
		
	    public ModelAndView showSummery(Customer Customer)
	    {
			ModelAndView mv = new ModelAndView("Summery");
			
			mv.addObject("Customer",Customer);
			return mv;
			
		   
		 }
		@RequestMapping("/menu")
		public ModelAndView showMenuItems() {
			
				List<MenuItems> leListOfItems = menuitemdao.findAll();
				ModelAndView mv= new ModelAndView("menu");
				mv.addObject("items",leListOfItems);
				
				return mv;
			
			/*List<MenuItems> items= new  ArrayList<MenuItems>();
			
			items.add(new MenuItems("Blonde Roast Coffee","Lightly roasted coffee that's soft, mellow and flavorful", 2.99));
			items.add(new MenuItems("Caffe Mistro","A one to one mix of fresh brewed coffee and steamed milk add up to one distinctly delicious coffee drink",3.99));
			items.add(new MenuItems("Decafe Pike Place Roast","Our signature medium roast coffee with a smooth,balanced and rich flavor,minus the caffeine",3.49));
			ModelAndView mv = new ModelAndView("menu");
			mv.addObject("items",items);
			//System.out.println(items.get(1).getName());
			return mv;*/
			
	  
		
		}
		
	
		
		}
		
	    
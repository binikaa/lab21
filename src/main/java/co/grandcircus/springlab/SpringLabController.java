package co.grandcircus.springlab;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringLabController {
	@Autowired
   MenuItemDao menuitemdao;
	
	
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
			
				//List<MenuItems> leListOfItems = menuitemdao.findAll();
				ModelAndView mv= new ModelAndView("menu");
				mv.addObject("items",menuitemdao.findAll());
				
				return mv;
		
		
		}
		@RequestMapping("/item/create")
		public ModelAndView showCreateForm() {
			ModelAndView mav = new ModelAndView("add");
			mav.addObject("title","Add a Item");
			return mav;
		}
		
		
		@RequestMapping(value="/add_item", method=RequestMethod.GET)
		public ModelAndView submitCreateForm(MenuItems menu_item) {
			menuitemdao.create(menu_item);
			return new ModelAndView("redirect:/menu");
		}
		@RequestMapping("/item/edit")
		public ModelAndView showeditForm() {
			ModelAndView mav = new ModelAndView("edit");
			return mav;
		}
		@RequestMapping(value="/edit_item", method=RequestMethod.GET)
	public ModelAndView submitEditForm(MenuItems menu_item) {
			menuitemdao.update(menu_item);
			return new ModelAndView("redirect:/menu");
		}
		
		}

	    
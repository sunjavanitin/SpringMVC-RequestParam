package com.nitin.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Userdefinecontroller {
	
	@RequestMapping(value="/loginpage",method=RequestMethod.GET)
	//loginpage is the name of form action 
	
	protected ModelAndView springBasic() throws Exception {
		
		ModelAndView obj=new ModelAndView("login"); 
		// login is the name of view(jsp file)
		
		obj.addObject("javat","LOGIN HERE....."); 
		// javat is the object holding value welcome to.....				
		return obj;
	}
		
	@RequestMapping(value="/loginsuccess",method=RequestMethod.POST) 
	//loginsuccess is the name of form action 
	protected ModelAndView userLogin(@RequestParam("name") String name, @RequestParam("pass") String pass) throws Exception {
					
		EMPLogin emp=new EMPLogin();
		emp.setName(name);
		emp.setPass(pass);
		
		ModelAndView obj=new ModelAndView("welcome"); 
		// welcome is the name of view(jsp file)
		
		obj.addObject("logsucceessmsg","\n"+"username is :-"+name+"\n"+"password is :-"+pass); 
		obj.addObject("emp",emp);
		// loginsuccess is the object holding value welcome to.....		
		return obj;
	}
}


package net.sat.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("Page");
		mv.addObject("greeting","Welcome to SPRING WEB MVC");
		return mv;
	}
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greeting){
		ModelAndView mv=new ModelAndView("Page");
		mv.addObject("greeting",greeting);
		return mv;
	}
}

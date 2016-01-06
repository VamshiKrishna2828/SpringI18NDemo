package com.cmc.sld.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	@RequestMapping("/hello")
	public ModelAndView homePage(Locale locale,Model model){
		System.out.println("From HomePage");
		String message = "From homePage";
		return new ModelAndView("homePage","message",message); 
	}

}

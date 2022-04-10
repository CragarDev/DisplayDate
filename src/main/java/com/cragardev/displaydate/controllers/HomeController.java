package com.cragardev.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
	
		return "index.jsp";
	
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		
	    Date today = new Date();
        SimpleDateFormat dayOfWeek = new SimpleDateFormat("EEEE");
        SimpleDateFormat dayOfMonth = new SimpleDateFormat("d");
        SimpleDateFormat MonthYear = new SimpleDateFormat("MMMMM, yyyy");
        String dayOW = dayOfWeek.format(today);
        String dayOM = dayOfMonth.format(today);
        String monthAndYear = MonthYear.format(today);
        
        String date = dayOW + ", the " + dayOM + " of " + monthAndYear;
        
        model.addAttribute("date", date);
		
		return "date.jsp";
		
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		
		Date today = new Date();
        SimpleDateFormat timeOfDay = new SimpleDateFormat("h:mm a");
        String time = timeOfDay.format(today);
        model.addAttribute("time", time);
		return "time.jsp";
	}
}

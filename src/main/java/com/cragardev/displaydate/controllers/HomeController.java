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
	
	@RequestMapping("/date2")
	public String date2(Model model) {
		
		Date today = new Date();
		SimpleDateFormat day2 = new SimpleDateFormat("EEEE, ' the 'd ' of 'MMMM, yyyy");
		SimpleDateFormat timeOfDayPt1 = new SimpleDateFormat("h:mm a");
		SimpleDateFormat timeOfDayPt2 = new SimpleDateFormat("zzzz");

		String day2Format = day2.format(today);
		String time2Format1 = timeOfDayPt1.format(today);
		String time2Format2 = timeOfDayPt2.format(today);

		model.addAttribute("date2", day2Format);
		model.addAttribute("time21", time2Format1);
		model.addAttribute("time22", time2Format2);
		
		return "date2.jsp";
		
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

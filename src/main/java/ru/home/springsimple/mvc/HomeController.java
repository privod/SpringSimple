package ru.home.springsimple.mvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ru.home.springsimple.service.PlanService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	 private PlanService planService;
	 
	 @Inject
	 public HomeController(PlanService planService) {
	     this.planService = planService;
	 }

	@RequestMapping(value = {"home", "/"}, method = RequestMethod.GET)
	public String home(Map<String, Object> model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
		
		model.put("plans", planService.getAll());
		
		return "home";
	}
	
}

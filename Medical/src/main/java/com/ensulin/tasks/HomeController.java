package com.ensulin.tasks;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nandu.props.ApplicationProperties;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		String[] uiProps = ApplicationProperties.getInstance().getProperty(ApplicationProperties.UI).split(",");
		Map<String,String> uiMap= new HashMap<String, String>();
		for(String key:uiProps)
			uiMap.put(key, ApplicationProperties.getInstance().getLink(key));
		model.addAttribute("uiProps",  uiMap);

		return "home";
	}

}

package com.ensulin.tasks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lab")
public class PathologyController {

	
	@RequestMapping("/home")
	public String pathologyHome(){
		return "labHome";
	}
}

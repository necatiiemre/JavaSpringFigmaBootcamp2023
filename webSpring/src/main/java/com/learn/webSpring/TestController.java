package com.learn.webSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@RequestMapping("/courses/{number}")
	public void print(@PathVariable int number,@RequestParam String name, @RequestParam String instructor) {
		System.out.println(number + " " + name + " " + instructor );
	}
}

package com.learn.webSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@PostMapping("/user")
	private User validateUser(@Valid @RequestBody User user) {
		System.out.println(user);
		return user;
	}
}

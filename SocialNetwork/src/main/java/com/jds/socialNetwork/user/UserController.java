package com.jds.socialNetwork.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "/add")
	public User addNewUser(@RequestParam String name, @RequestParam String email) {
		return userService.addNewUser(name, email);
	}
	
	@PostMapping(path = "/add")
	public User addNewUser(@RequestBody User user) {
		return userService.addNewUser(user);
	}

	@GetMapping(path = "/all")
	public Iterable<User> getAllUsers() {
		return userService.getAllUsers();
	}

}

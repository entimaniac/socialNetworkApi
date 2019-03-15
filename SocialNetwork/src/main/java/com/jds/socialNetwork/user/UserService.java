package com.jds.socialNetwork.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User addNewUser(String name, String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		return userRepository.save(user);
	}

	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User addNewUser(User user) {
		return userRepository.save(user);
	}

}

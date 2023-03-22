package com.am.petshop.user.controller;

import com.am.petshop.user.rest.UserDto;
import com.am.petshop.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/register")
	ResponseEntity <Map<String,String>> registerUser(@RequestBody UserDto user){
		Map<String,String> getInfo = new HashMap<>();
		Long user_id  = userService.createUser(user);
		getInfo.put("message", "User created with id " + user_id);
		log.info("User created with id " + user_id);
		return new ResponseEntity<>(getInfo, HttpStatus.CREATED);
	}
}

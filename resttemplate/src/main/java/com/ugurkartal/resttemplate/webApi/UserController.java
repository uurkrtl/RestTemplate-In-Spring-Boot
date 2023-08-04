package com.ugurkartal.resttemplate.webApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ugurkartal.resttemplate.business.abstracts.UserService;
import com.ugurkartal.resttemplate.entities.User;

@RestController
@RequestMapping(path = "/api")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping(path = "/users")
	ResponseEntity<User[]> getAll(){
		User[] users = userService.getUsers();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
}
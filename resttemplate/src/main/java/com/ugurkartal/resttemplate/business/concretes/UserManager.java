package com.ugurkartal.resttemplate.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ugurkartal.resttemplate.business.abstracts.UserService;
import com.ugurkartal.resttemplate.entities.User;

@Service
public class UserManager implements UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static String GITHUB_API = "https://api.github.com/users";
	
	@Override
	public User[] getUsers() {
		User[] result = restTemplate.getForEntity(GITHUB_API, User[].class).getBody();
		return result;
	}
}
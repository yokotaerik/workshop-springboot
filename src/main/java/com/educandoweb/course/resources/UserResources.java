package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	@ResponseBody
	public ResponseEntity<User> findAll() {
		User u = new User(1L , "maria", "maria@gmail.com", "09999", "12313");
		return ResponseEntity.ok().body(u);
	}
}

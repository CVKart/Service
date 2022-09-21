package com.cvkart.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cvkart.service.entity.User;
import com.cvkart.service.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
    public List<User> getAllProducts(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public User getAllProducts(@PathVariable Integer id){
        return userService.getUsersById(id);
    }

    @PostMapping
    public void addProduct(@Validated @RequestBody  User user){
    	System.out.println(user);
    	userService.addUser(user);
    }

}

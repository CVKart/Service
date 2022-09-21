package com.cvkart.service.service;

import java.util.List;

import com.cvkart.service.entity.User;


public interface UserService {
	
	public List<User> getAllUsers();

    public User getUsersById(Integer id);

    public void addUser(User user);

}

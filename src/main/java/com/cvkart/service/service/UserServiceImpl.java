package com.cvkart.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cvkart.service.entity.User;
import com.cvkart.service.repository.UserRepo;

@Service
@Transactional(readOnly = false)
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo; 

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUsersById(Integer id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).get();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
		
	}

}

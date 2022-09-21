package com.cvkart.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvkart.service.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUserName(String userName);
}

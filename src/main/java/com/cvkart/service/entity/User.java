package com.cvkart.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
	
	@NotNull
    private String userName;
	@NotNull
    private String userEmail;
	@NotNull
    private Float userPassword;
	@NotNull
    private Integer userPhone;
	@NotNull
    private char userType = 'c';

}

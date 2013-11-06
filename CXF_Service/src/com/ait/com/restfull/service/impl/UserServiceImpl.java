package com.ait.com.restfull.service.impl;

import java.text.SimpleDateFormat;

import com.ait.com.restfull.dto.User;
import com.ait.com.restfull.service.IUserService;

public class UserServiceImpl implements IUserService {   

	public User getUser(long id,String name) {   
		User user=new User();   
		user.setId(id);   
		user.setName(name);   
		try {   
			user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1987-02-01"));   
		} catch (Exception e) {   
			e.printStackTrace();   
		}   
		return user;   
	}   

	public User getUser(String name) {   
		User user=new User();   
		user.setId(1);   
		user.setName(name);   
		try {   
			user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("1985-03-01"));   
		} catch (Exception e) {   
			e.printStackTrace();   
		}   
		return user;   
	}

	@Override
	public User getUser(User user) {
		System.out.println("getUser");
		if(user != null)
			System.out.println( user.getId() + " " + user.getName() + "  " + user.getBirthday().toLocaleString());
		else
			System.out.println("user is null!");
		return user;
	}   


}

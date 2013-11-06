package com.ait.com.restfull.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="User")   
public class User {   
	private long id;   
	private String name;   
	private Date birthday;   
	public long getId() {   
		return id;   
	}   
	public void setId(long id) {   
		this.id = id;   
	}   
	public String getName() {   
		return name;   
	}   
	public void setName(String name) {   
		this.name = name;   
	}   
	public Date getBirthday() {   
		return birthday;   
	}   
	public void setBirthday(Date birthday) {   
		this.birthday = birthday;   
	}   


}

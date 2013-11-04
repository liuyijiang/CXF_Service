package com.ait.com.restfull.dto;

import java.io.File;

public class UserForm {
   
	private String name;
	private File image;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	
	
	
}

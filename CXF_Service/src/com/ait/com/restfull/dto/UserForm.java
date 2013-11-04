package com.ait.com.restfull.dto;


import javax.ws.rs.FormParam;

import org.jboss.resteasy.annotations.providers.multipart.PartType;

public class UserForm {
   
	private String name;
	
	private byte[] image;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getImage() {
		return image;
	}
	
	@FormParam("images")  
	@PartType("application/octet-stream")  
	public void setImage(byte[] image) {
		this.image = image;
	}
    	
	
}

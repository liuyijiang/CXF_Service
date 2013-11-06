package com.ait.com.restfull.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ait.com.restfull.dto.User;

@Path(value="/user")   
@Produces(MediaType.APPLICATION_JSON)  //指定返回给客户端的类型  
@Consumes(MediaType.TEXT_XML)  //接收客户端来的类型	
public interface IUserService {   
	
	@GET  
	@Path(value="/info/{id}")
	public User getUser(@PathParam("id") long id,@QueryParam("name") String name);   

	@GET  
	@Path(value="/info2")   
	public User getUser(@QueryParam("name") String name);   
	
	@POST
	@Path(value = "/info3")
	public User getUser(User user); 
	
}  

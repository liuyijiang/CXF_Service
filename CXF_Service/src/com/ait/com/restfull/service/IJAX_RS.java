package com.ait.com.restfull.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

public interface IJAX_RS {

	@Path("customers/{firstname}-{lastname}")
	public String getCustomer(@PathParam("firstname") String firstname, @PathParam("lastname") String lastname);
	
	
	@GET
	@Path("{id : \\d+}")
	public String getCustomer(@PathParam("id") int id);
	
}

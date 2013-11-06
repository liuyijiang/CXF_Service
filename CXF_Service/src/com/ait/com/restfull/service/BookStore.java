package com.ait.com.restfull.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.ait.com.restfull.dto.BaseVo;

@Path("/bookstore")
public interface BookStore {
	
   @GET
   BaseVo getAllBooks();
    
   @Path("{id}")
   BaseVo getBookSubresource(@PathParam("id") long id);
}

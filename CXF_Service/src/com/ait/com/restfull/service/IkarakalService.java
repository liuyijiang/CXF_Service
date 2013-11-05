package com.ait.com.restfull.service;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import com.ait.com.restfull.dto.BaseVo;
import com.ait.com.restfull.dto.UserForm;

public interface IkarakalService {
  
	public BaseVo testPathParm(@PathParam("id") String id);
	public BaseVo testPathParmMore(@PathParam("id") String id,
			@PathParam("name") String name,@PathParam("address") String address);
	public BaseVo testMatrixParam(@PathParam("id") String id,@MatrixParam("name")String name,@MatrixParam("color")String color);
	public BaseVo testQueryParm(@PathParam("id") String id,@QueryParam("name")String name,@QueryParam("color")String color);
	public BaseVo testheaderParm(@PathParam("id") String id,@HeaderParam("Referer") String header);
	
	public BaseVo testFormParam(@MultipartForm UserForm from);
	
	public BaseVo testGetUrlParam(@Context UriInfo uriInfo);
	
	public Response testRespone();
}

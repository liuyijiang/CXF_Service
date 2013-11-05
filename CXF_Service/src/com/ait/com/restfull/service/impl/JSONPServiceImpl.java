package com.ait.com.restfull.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ait.com.restfull.dto.BaseVo;
import com.ait.com.restfull.service.IJSONPService;

public class JSONPServiceImpl implements IJSONPService{
  
	@Override
	@GET
	@Path("/jsonp/testJsonpParm/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/x+javascript"})
	public BaseVo testPathParm(@PathParam("id") String id){
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("jsonp_successfull:" + id);
		return vo;
	}
	
}

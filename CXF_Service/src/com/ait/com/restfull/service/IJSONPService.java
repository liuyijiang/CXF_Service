package com.ait.com.restfull.service;

import javax.ws.rs.PathParam;

import com.ait.com.restfull.dto.BaseVo;

public interface IJSONPService {

	public BaseVo testPathParm(@PathParam("id") String id);
	
}

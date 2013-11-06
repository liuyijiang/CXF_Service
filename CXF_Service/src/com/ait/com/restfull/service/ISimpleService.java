package com.ait.com.restfull.service;

import javax.ws.rs.PathParam;

import com.ait.com.restfull.dto.BaseVo;

public interface ISimpleService {

	public BaseVo testGet(@PathParam("id") String id);
	
}

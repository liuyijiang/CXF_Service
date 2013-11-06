package com.ait.com.restfull.service.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ait.com.restfull.dto.BaseVo;
import com.ait.com.restfull.service.ISimpleService;
/**
 * 测试client端调用   
 * 测试拦截器
 * @author Administrator
 *
 */
public class SimpleServiceImpl implements ISimpleService {

	@Override
	@GET
	@Path("/simple/testGet/{id}")
	@Consumes(MediaType.TEXT_XML)
	@Produces("application/json")//返回类型
	public BaseVo testGet(@PathParam("id") String id) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id);
		return vo;
	}

}

package com.ait.com.restfull.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import com.ait.com.restfull.dto.BaseVo;
import com.ait.com.restfull.dto.UserForm;
import com.ait.com.restfull.service.IkarakalService;

public class IkarakalServiceImpl implements IkarakalService {

	//单个参数
	@Override
	@GET
	@Path("/karakal/testPathParm/{id}")
	@Produces("application/json")
	public BaseVo testPathParm(@PathParam("id") String id) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id);
		return vo;
	}

	
	@Override
	@GET
	@Path("/karakal/testPathParmMore/{id}-{name}-{address}")
	@Produces("application/json;charset=utf-8")
	public BaseVo testPathParmMore(@PathParam("id") String id,
			@PathParam("name") String name,@PathParam("address") String address) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id + " - " + name + " - " + address);
		return vo;
	}
	
	//@PathParam获得的总是最后的路径参数
	@GET
	@Path("/karakal/testPathParmMore/{id}/name/{id}")
	@Produces("application/json;charset=utf-8")
	public BaseVo testPathParmMoreD(@PathParam("id") String id) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id);
		return vo;
	}

   //url:http://localhost:8080/CXF_Service/karakalService/karakal/testMatrixParam/2;name=liuyijiang;color=蓝色
	//接收url中key=value参数
	@Override
	@GET
	@Path("/karakal/testMatrixParam/{id}")
	@Produces("application/json;charset=utf-8")
	public BaseVo testMatrixParam(@PathParam("id") String id,@MatrixParam("name")String name,@MatrixParam("color")String color) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id + " - " + name + " - " + color);
		return vo;
	}

   //查询参数 url:http://localhost:8080/CXF_Service/karakalService/karakal/testQueryParm/2?name=liu&color=绿色
	//接收url中&隔开的参数
	@Override
	@GET
	@Path("/karakal/testQueryParm/{id}")
	@Produces("application/json;charset=utf-8")
	public BaseVo testQueryParm(@PathParam("id") String id,@QueryParam("name")String name,@QueryParam("color")String color) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id + " - " + name + " - " + color);
		return vo;
	}

	//如果想使用多个header信息可以使用 @Context HttpHeaders headers
	//  String referer = headers.getRequestHeader("Referer").get(0);
	//   for (String header : headers.getRequestHeaders().keySet())
	//   System.out.println("This header was set: " + header);
	//
	@Override
	@GET
	@Path("/karakal/testheaderParm/{id}")
	@Produces("application/json;charset=utf-8")
	public BaseVo testheaderParm(@PathParam("id") String id,@HeaderParam("user-agent") String referer){
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id + " Hader: "+ referer);
		System.out.println(referer);
		return vo;
	}


	@Override
	@POST
	@Path("/karakal/testFormParam")
	@Consumes("multipart/form-data") 
	@Produces("application/json;charset=utf-8")
	public BaseVo testFormParam(@MultipartForm UserForm from) {
		String fileName = "d:\\anything"; 
		try {  
            writeFile(from.getImage(), fileName);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:");
		return vo;
	}
	
	private void writeFile(byte[] content, String filename) throws IOException {  
		   
        File file = new File(filename);  
   
        if (!file.exists()) {  
            file.createNewFile();  
        }  
   
        FileOutputStream fop = new FileOutputStream(file);  
   
        fop.write(content);  
        fop.flush();  
        fop.close();  
   
    }  
	//@FormParam  @CookieParam @DefaultValue
	
	
}

package com.ait.com.restfull.service.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;

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


	//获取url
	@Override
	@GET
	@Path("/karakal/testGetUrlParam")
	@Produces("application/json;charset=utf-8")
	public BaseVo testGetUrlParam(@Context UriInfo uriInfo) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" +uriInfo.getPath());
		System.out.println(uriInfo.getAbsolutePath());
		System.out.println(uriInfo.getBaseUri().getPath());
		System.out.println(uriInfo.getRequestUri().getPath());
		return vo;
	}


	@Override
	@GET
	@Path("/karakal/testRespone")
	@Produces("application/json;charset=utf-8")
	public Response testRespone() {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:");
		//* ETag ETag是用来表示数据版本的、假设唯一的某个标识。它的值是任一一个以引用括起的字符串，通常是MD5 哈希值。 
		// EntityTag tag = new EntityTag("ss");
		ResponseBuilder builder = Response.ok(vo, "application/json");
		Date date = new Date();
		//builder.expires(date);//缓存时间
		CacheControl cc = new CacheControl();
		cc.setMaxAge(3000);
		cc.setNoTransform(false);
		cc.setNoStore(false);
		cc.setNoCache(false);
		builder.cacheControl(cc);
		//builder.tag(tag);
		System.out.println("exe。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
		return builder.build();
	}
	/**
	 * HTTP1.1中重新设计了缓存语法。通过使用Cache-Control来对cache进行控制，其中的值以逗号分隔。它包括：
     *  private
     *		用于指定当且仅有Client才能缓存这个数据
	 *	public
	 *	指定在 请求/响应 链中的任何环节都可以缓存数据
	 *	no-cache
	 *	这个指令用于指示数据不应该缓存或者除非数据被重新验证过，否则不能被用于再次请求
	 *	no-store
	 *	通过缓存数据都被缓存了硬盘中，以使用得下次可以；这个指令表示不要将缓存存在本地。
	 *	no-transform
	 *	有时缓存会被自动进行转换以节省内存或者带宽，例如压缩图像。no-transform用于指定不允许进行数据转换
	 *	max-age
	 *	max-age用于指示缓存的有效期；如果max-age和Expires同时指定，则max-age有效
	 *	s-maxage
		用于指定缓存在一个共享的，中间节点的最大生命期。
	 */
	
}

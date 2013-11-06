package com.ait.com.restfull.client;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

import com.ait.com.restfull.dto.User;

public class SimpleServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     
		WebClient client=WebClient.create("http://localhost:8080/CXF_Service/rest/userService/user/info/3?name=is_zhoufeng");
//		Response p = client.accept("text/xml").get();
//		System.out.println(p.getEntity().toString());
//		p.
		User user=(User)client.accept("application/json").get(User.class);   //accept()接受类型
		System.out.println(user.getName());   
		
	}

}

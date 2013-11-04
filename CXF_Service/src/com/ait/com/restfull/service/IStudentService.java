package com.ait.com.restfull.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.ait.com.restfull.dto.ResultDto;
import com.ait.com.restfull.dto.StudentDto;

@Path(value="/")
public interface IStudentService {
   
    /**
     * 
     * @param page
     * @param limit
     * @return
     */
    @GET
    @Path(value="/getStudentPage/{page}/{limit}")
    @Consumes("application/json;charset=utf-8")
    ResultDto getStudentPage(@PathParam("page") int page,@PathParam("limit") int limit);
   
    /**
     * 
     * @param id
     * @return
     */
    @GET
    //@PUT @POST
    @Path(value="/getStudentById/{id}")
    ResultDto getStudentById(@PathParam("id") long id);
   
    /**
     * 
     * @param id
     * @return
     */
    @GET
    @Path(value="/deleteDeleteStudentById/{id}")
    ResultDto deleteDeleteStudentById(@PathParam("id") long id);
   
    /**
     * 
     * @param student
     * @return
     */
    @GET
    @Path(value="/addStudent/{name}/{age}/{scroe}/{address}")
    ResultDto addStudent(@PathParam("")StudentDto student);
    
}
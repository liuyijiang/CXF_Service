package com.ait.com.restfull.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class ResultDto {

	public Integer totalCount;//总记录数
    public Integer totalPage;//总页数
    public List<StudentDto> students;//学生列表
    public String returncode;//反回状态码
	
}

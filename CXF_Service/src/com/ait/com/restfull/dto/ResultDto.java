package com.ait.com.restfull.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class ResultDto {

	public Integer totalCount;
    public Integer totalPage;
    public List<StudentDto> students;
    public String returncode;
	
}

package com.ait.com.restfull.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class ResultDto {

	public Integer totalCount;//�ܼ�¼��
    public Integer totalPage;//��ҳ��
    public List<StudentDto> students;//ѧ���б�
    public String returncode;//����״̬��
	
}

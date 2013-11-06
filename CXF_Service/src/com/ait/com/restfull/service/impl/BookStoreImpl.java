package com.ait.com.restfull.service.impl;

import java.awt.print.Book;

import javax.ws.rs.GET;

import com.ait.com.restfull.dto.BaseVo;
import com.ait.com.restfull.service.BookStore;

public class BookStoreImpl implements BookStore {

	@Override
	public BaseVo getAllBooks() {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" );
		return vo;
	}

	@Override
	public BaseVo getBookSubresource(long id) {
		BaseVo vo = new BaseVo();
		vo.setCode("200");
		vo.setMessage("successfull:" + id);
		return vo;
	}
	 
}

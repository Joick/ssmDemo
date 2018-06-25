package com.simpledemo.service;

import java.util.List;

import com.simpledemo.dto.AppointExecution;
import com.simpledemo.entity.Book;

public interface BookService {

	/**
	 * 根据ID查询图书信息
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);

	/**
	 * 获取所有图书信息
	 * 
	 * @return
	 */
	List<Book> getList();

	/**
	 * 预约图书
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId, long studentId);

}

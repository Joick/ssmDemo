package com.simpledemo.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.simpledemo.dao.AppointmentDao;
import com.simpledemo.dao.BookDao;
import com.simpledemo.dto.AppointExecution;
import com.simpledemo.entity.Appointment;
import com.simpledemo.entity.Book;
import com.simpledemo.enums.AppointStateEnum;
import com.simpledemo.exception.AppointException;
import com.simpledemo.exception.NoNumberException;
import com.simpledemo.exception.RepeatAppointException;
import com.simpledemo.service.BookService;

public class BookServiceImpl implements BookService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BookDao bookDao;
	@Autowired
	private AppointmentDao appointmentDao;

	public Book getById(long bookId) {
		// TODO Auto-generated method stub
		return bookDao.queryById(bookId);
	}

	public List<Book> getList() {
		// TODO Auto-generated method stub
		return bookDao.queryAll(0, 1000);
	}

	@Transactional
	/**
	 * 使用注解控制事务多发;1,开发团队达成一致约定,明确注释事务方法的变成风格
	 * 2.保证事务方法的执行时间尽可能短,不要穿插其他网络操作,RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务,如只有一条操作,只读操作不需要事务控制
	 */
	public AppointExecution appoint(long bookId, long studentId) {
		// TODO Auto-generated method stub
		try {
			// 减库存
			int update = bookDao.reduceNumber(bookId);
			if (update <= 0) { // 库存不足
				// return new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);//错误写法
				throw new NoNumberException("no number");
			} else {
				// 执行预约操作
				int insert = appointmentDao.insertAppointment(bookId, studentId);
				if (insert <= 0) { // 预约失败
					// return new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT); // 错误写法
					throw new RepeatAppointException("repeat appoint");
				} else { // 预约成功
					Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
					return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
				}
			}
		} catch (NoNumberException e1) {
			// TODO: handle exception
			throw e1;
		} catch (RepeatAppointException e2) {
			throw e2;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.getMessage(), e);
			throw new AppointException("appoint inner error:" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

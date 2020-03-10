package com.bbs.service;

import com.bbs.dao.UserDao;
import com.bbs.pojo.Register;

public class UserService {
	private UserDao userDao = new UserDao();
	/**
	 * 把账户添加到数据库
	 * @param register
	 * @return
	 */
	public int addUserId(Register register) {
		return userDao.addUserId(register);
	}
}

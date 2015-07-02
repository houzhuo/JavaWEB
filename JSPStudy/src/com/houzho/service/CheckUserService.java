package com.houzho.service;

import java.sql.Connection;
import java.sql.ResultSet;

import com.houzho.dao.UserDao;
import com.houzho.dao.impl.UserDaoImpl;
import com.houzhuo.entity.User;
import com.houzhuo.util.ConnectionFactory;import com.sun.xml.internal.ws.model.CheckedExceptionImpl;

/*
 * 业务层
 */

public class CheckUserService {
	private UserDao userDao = new UserDaoImpl();
	public boolean check(User user){
		Connection conn =null;
		try {
			conn= ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			ResultSet rs = userDao.get(conn, user);
			
			while(rs.next()){
				return true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		finally {
			try {
				conn.close();
			} catch (Exception e3) {
				// TODO: handle exception
				e3.printStackTrace();
			}
		}
		return false;
	}
}

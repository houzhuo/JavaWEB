package com.houzhuo.test;

import java.sql.Connection;

import com.houzho.dao.UserDao;
import com.houzho.dao.impl.UserDaoImpl;
import com.houzhuo.entity.User;
import com.houzhuo.util.ConnectionFactory;

public class UserDaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);

			UserDao userDao = new UserDaoImpl();

			User tom = new User();
			tom.setName("Tom");
			tom.setPassword("123456");
			tom.setEmail("297505308@qq.com");

			userDao.save(conn, tom);
			conn.commit();

		} catch (Exception e) {
			// TODO: handle exception
			try {
				conn.rollback();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

}

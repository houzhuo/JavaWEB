package com.houzho.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.houzho.dao.UserDao;
import com.houzhuo.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(Connection conn, User user) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement ps = conn.prepareCall("insert into tbl_user(name, password, email) values (?,?,?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.execute();
	}

	@Override
	public void update(Connection conn, Long id, User user) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement ps = conn
				.prepareStatement("update tbl_user set name = ?,password = ?,email = ? where id = ?");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setLong(4, id);
		ps.execute();
	}

	@Override
	public void delete(Connection conn, User user) throws Exception {
		// TODO Auto-generated method stub
		PreparedStatement ps = conn.prepareStatement("delete from tbl_user whrer id = ?");
		ps.setLong(1, user.getId());
		ps.execute();
	}

	@Override
	public ResultSet get(Connection conn, User user) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = conn.prepareStatement("select * from tbl_user where name=? and password = ?");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		return ps.executeQuery();
	}

}

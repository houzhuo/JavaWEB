package com.houzho.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.houzhuo.entity.User;

public interface UserDao {

	public void save(Connection conn, User user) throws Exception;

	public void update(Connection conn, Long id, User user) throws Exception;

	public void delete(Connection conn, User user) throws Exception;
	
	public ResultSet get(Connection conn,User user) throws SQLException;

}

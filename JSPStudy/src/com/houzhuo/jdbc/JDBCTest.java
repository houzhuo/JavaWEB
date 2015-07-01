package com.houzhuo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class JDBCTest {
	
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	
	public static void insert(){
		Connection conn = getConnection();
		try {
			String sql = "INSERT INTO tbl_user(name, password, email)" + "VALUES ('Tom','123456','tom@outlook.com')";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户表中插入了 "+count+"条记录");
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void update(){
		Connection conn = getConnection();
		try {
			String sql = "UPDATE tbl_ueser SET　email ='houzhou@qq.com' WHERE name = 'Tom'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户表中更新了 "+count+"条记录");
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static void delete(){
		Connection conn = getConnection();
		try {
			String sql = "DELETE FROM tbl_user WHERE name = 'Tom'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户表中删除了 "+count+"条记录");
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args){
		
		insert();
		
	}
	
	
	/*public static void main(String[] args) {
		String sql = "select * from tbl_user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		System.out.println("???");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "");
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			System.err.println(rs+"");
			

			while (rs.next()) {
				System.out.print(rs.getInt("id") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("password") + " ");
				System.out.print(rs.getString("email") + " ");
				System.out.println();
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}*/

}

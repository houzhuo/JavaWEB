package com.houzhuo.util;

//连接管理类
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {
	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;

	private Connection conn;

	private static final ConnectionFactory factory = new ConnectionFactory();

	/*
	 * 配置信息的读取代码，静态代码块初始化类，对类进行赋值，只会执行一次
	 */
	static {
		Properties prop = new Properties();//用来保存属性文件中的键值对
		try {
			InputStream in = ConnectionFactory.class.getClassLoader().getResourceAsStream("dbconfig.properties");
			prop.load(in);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("===========配置文件读取错误=================");
		}

		driver = prop.getProperty("driver");
		dburl = prop.getProperty("dburl");
		user = prop.getProperty("user");
		password = prop.getProperty("password");

	}

	private ConnectionFactory() {

	}

	/*
	 * 获取ConnectionFactory实例，单例模式！！！
	 */
	public static ConnectionFactory getInstance() {
		return factory;
	}

	public Connection makeConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}

}

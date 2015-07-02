package com.houzhuo.entity;

/*
 * 优化jdbc程序
 * DTO 数据传输对象，用于对象远程调用，不包含业务逻辑。只有setter，getter，构造函数，可通过DAO将数据库中的表转化为DTO类
 * 此节DTo分别对象两个数据库的表
 */
//封装了非业务的主键信息
public  abstract class IdEntity {
	protected Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}

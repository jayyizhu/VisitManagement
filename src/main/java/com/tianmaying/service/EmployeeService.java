package com.tianmaying.service;

import java.util.List;

import com.tianmaying.entity.EmployeeEntity;

public interface EmployeeService {
	/**
	 * 查询所有的User对象
	 * @return
	 */
	List<EmployeeEntity> findAll();
	
	/**
	 * save user
	 * @param user
	 */
	void save(EmployeeEntity employee) ;
}

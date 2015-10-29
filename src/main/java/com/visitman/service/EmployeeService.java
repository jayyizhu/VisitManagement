package com.visitman.service;

import java.util.List;

import com.visitman.entity.EmployeeEntity;

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

package com.tianmaying.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianmaying.entity.EmployeeEntity;
import com.tianmaying.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	/**
	 * 查询所有的Employee对象
	 * @return
	 */
	public List<EmployeeEntity> findAll(){
		return employeeRepository.findAll();
	}
	
	/**
	 * save employee
	 * @param employee
	 */
	public void save(EmployeeEntity employee) {
		employeeRepository.save(employee);
	}
}

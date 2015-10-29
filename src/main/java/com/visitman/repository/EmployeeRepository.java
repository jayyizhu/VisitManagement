package com.visitman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visitman.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
	
	/**
	 * 根据userName查询
	 * @author lance
	 * 2014-6-11下午11:30:31
	 * @param userName
	 * @return
	 */
	EmployeeEntity findByEmpId(String empId);
}

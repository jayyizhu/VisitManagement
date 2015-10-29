package com.visitman.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.visitman.entity.VisitHisEntity;

public interface VisitHisService {
	/**
	 * 查询所有的VisitHis对象
	 * @return
	 */
	List<VisitHisEntity> findAll(String companyName);
	
	Page<VisitHisEntity> findBypagination(Pageable pageable);
	
	/**
	 * save visitHis
	 * @param visitHis
	 */
	void save(VisitHisEntity visitHis) ;
}

package com.tianmaying.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tianmaying.entity.VisitHisEntity;

public interface VisitHisRepository extends JpaRepository<VisitHisEntity, Long>{
	
	/**
	 * 根据userName查询
	 * @author lance
	 * 2014-6-11下午11:30:31
	 * @param userName
	 * @return
	 */
	VisitHisEntity findByRecdId(String recdId);
}

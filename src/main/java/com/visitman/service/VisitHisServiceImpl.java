package com.visitman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.visitman.entity.VisitHisEntity;
import com.visitman.repository.VisitHisRepository;

@Service
public class VisitHisServiceImpl implements VisitHisService{
	@Autowired
	private VisitHisRepository visitHisRepository;
	
	/**
	 * 查询所有的Employee对象
	 * @return
	 */
	public List<VisitHisEntity> findAll(String companyName){
		return visitHisRepository.findAll();
	}
	
	/**
	 * save employee
	 * @param employee
	 */
	public void save(VisitHisEntity visitHis) {
		visitHisRepository.save(visitHis);
	}

	@Override
	public Page<VisitHisEntity> findBypagination(Pageable pageable) {
		Page<VisitHisEntity> pageVisit = visitHisRepository.findAll(pageable);
		return pageVisit;
	}
}

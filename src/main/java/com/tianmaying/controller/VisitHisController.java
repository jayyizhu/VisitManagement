package com.tianmaying.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianmaying.entity.VisitHisEntity;
import com.tianmaying.service.VisitHisService;

@Controller
public class VisitHisController {
	@Autowired
	private VisitHisService visitHisService;

	@RequestMapping("/visit/view")
	public String index() {
		return "region";
	}
	
	@RequestMapping("/visit/query")
	public String query(Model model) {
		int pageNumber = 0;
		int pageSize = 10; 
		Pageable pageable = new PageRequest(pageNumber, pageSize);
		Page<VisitHisEntity> page = visitHisService.findBypagination(pageable);
		List<VisitHisEntity> list = page.getContent();
		model.addAttribute("visitList", list);
		return "visitHisShow";
	}
	
	@RequestMapping("/visit/update")
	public String update() {
		return "home";
	}
	
	@RequestMapping(value = "/visit/add", method = RequestMethod.POST)
	@ResponseBody
	public String add(@RequestBody VisitHisEntity visit, Model model) {
		String resultMsg = "";
		visitHisService.save(visit);
		resultMsg = "操作成功";
		return resultMsg;
	}
}
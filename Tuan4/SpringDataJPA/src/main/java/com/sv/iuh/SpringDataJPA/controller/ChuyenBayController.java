package com.sv.iuh.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.iuh.SpringDataJPA.entity.ChuyenBay;
import com.sv.iuh.SpringDataJPA.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayController {
	
	private ChuyenBayService chuyenBayService;
	
	@Autowired
	public ChuyenBayController(ChuyenBayService theService) {
		chuyenBayService = theService;
	}
	
	@GetMapping("/ChuyenBay/{gaDen}")
	public List<ChuyenBay> findChuyenBayByGaDen(@PathVariable String gaDen) {
		return chuyenBayService.findChuyenBayByGaDen(gaDen);
	}
	
}

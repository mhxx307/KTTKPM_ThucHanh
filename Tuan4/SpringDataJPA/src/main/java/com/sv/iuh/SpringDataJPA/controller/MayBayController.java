package com.sv.iuh.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.iuh.SpringDataJPA.service.MayBayService;

@RestController
@RequestMapping("/api")
public class MayBayController {
	@Autowired
	private MayBayService mayBayService;
	
	@GetMapping("/MayBay/tamBay/{tamBay}")
	public List<String> findCacLoaiMayBayTheoTam(@PathVariable int tamBay) {
		return mayBayService.findCacLoaiMayBayTheoTam(tamBay);
	}
	
	@GetMapping("/MayBay/count/loai/{loai}")
	public int countMayBayTheoLoai(@PathVariable String loai) {
		System.out.println(loai);
		return mayBayService.countMayBayTheoLoai(loai);
	}
	
	@GetMapping("/MayBay/getMayBayTheoChuyenBayVN280")
	public List<String> getMayBayTheoChuyenBayVN280() {
		return mayBayService.getLoaiMayBayTheoChuyenBayVN280();
	}
}

package com.sv.iuh.SpringDataJPA.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.iuh.SpringDataJPA.entity.NhanVien;
import com.sv.iuh.SpringDataJPA.service.NhanVienService;

@RestController
@RequestMapping("/api")
public class NhanVienController {
	private NhanVienService nhanVienService;
	
	@Autowired
	public NhanVienController(NhanVienService theService) {
		nhanVienService = theService;
	}
	
	@PostMapping("/NhanVien")
	public NhanVien saveNhanVien(@RequestBody NhanVien nhanVien) {
//		nhanVien.setMaNV("NV"+new Random().nextInt());
		nhanVienService.insertEmployee(nhanVien);
		return nhanVien;
	}
}

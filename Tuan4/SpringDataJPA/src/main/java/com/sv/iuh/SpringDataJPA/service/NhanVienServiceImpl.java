package com.sv.iuh.SpringDataJPA.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.iuh.SpringDataJPA.dao.NhanVienRepository;
import com.sv.iuh.SpringDataJPA.entity.NhanVien;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	
	private NhanVienRepository nhanVienRepository;
	
	@Autowired
	public NhanVienServiceImpl(NhanVienRepository theRepository) {
		nhanVienRepository = theRepository;
	}

	@Override
	@Transactional
	public void insertEmployee(NhanVien employee) {
		nhanVienRepository.save(employee);
	}

	@Override
	@Transactional
	public List<NhanVien> findNhanVienByLuong(int luong) {
		List<NhanVien> listNV = nhanVienRepository.findNhanVienByLuong(luong);
		return listNV;
	}

}

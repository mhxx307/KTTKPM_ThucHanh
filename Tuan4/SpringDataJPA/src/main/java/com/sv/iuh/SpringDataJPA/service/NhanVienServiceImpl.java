package com.sv.iuh.SpringDataJPA.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.iuh.SpringDataJPA.dao.NhanVienRepository;
import com.sv.iuh.SpringDataJPA.entity.NhanVien;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	
	private NhanVienRepository employeeRepository;
	
	@Autowired
	public NhanVienServiceImpl(NhanVienRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}

	@Override
	@Transactional
	public void insertEmployee(NhanVien employee) {
		employeeRepository.save(employee);
	}

}

package com.sv.iuh.SpringDataJPA.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.iuh.SpringDataJPA.dao.NhanVienRepository;
import com.sv.iuh.SpringDataJPA.entity.NhanVien;
import com.sv.iuh.SpringDataJPA.service.NhanVienService;

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

	@Override
	@Transactional
	public int getToTalSalary() {
		return nhanVienRepository.getToTalSalary();
	}

	@Override
	@Transactional
	public List<Integer> getEmployeesIdByPlane(String loai) {
		return nhanVienRepository.getEmployeesIdByPlane(loai);
	}

	@Override
	@Transactional
	public List<String> getEmployeesNameByPlaneId(int id) {
		return nhanVienRepository.getEmployeesNameByPlaneId(id);
	}

	@Override
	@Transactional
	public List<Integer> getPlaneIdByPilotLastName(String lastName) {
		return nhanVienRepository.getPlaneIdByPilotLastName(lastName);
	}

	@Override
	@Transactional
	public List<Integer> getEmployeesIdByPlane(String loai1, String loai2) {
		return nhanVienRepository.getEmployeesIdByPlane(loai1, loai2);
	}

	@Override
	@Transactional
	public List<String> getPilotNameByPlaneName(String planeName) {
		return nhanVienRepository.getPilotNameByPlaneName(planeName);
	}

	@Override
	@Transactional
	public List<NhanVien> getListNhanVienNotIsPilot() {
		return nhanVienRepository.getListNhanVienNotIsPilot();
	}

	@Override
	@Transactional
	public long getPilotSalary() {
		return nhanVienRepository.getPilotSalary();
	}
	
	

}

package com.sv.iuh.SpringDataJPA.service;

import java.util.List;

import com.sv.iuh.SpringDataJPA.entity.NhanVien;

public interface NhanVienService  {
	public void insertEmployee(NhanVien employee);
	public List<NhanVien> findNhanVienByLuong(int luong);
}

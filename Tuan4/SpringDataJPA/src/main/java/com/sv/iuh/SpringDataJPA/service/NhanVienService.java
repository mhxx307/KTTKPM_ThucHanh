package com.sv.iuh.SpringDataJPA.service;

import java.util.List;

import com.sv.iuh.SpringDataJPA.entity.NhanVien;

public interface NhanVienService  {
	public void insertEmployee(NhanVien employee);
	public List<NhanVien> findNhanVienByLuong(int luong);
	public int getToTalSalary();
	public List<Integer> getEmployeesIdByPlane(String loai);
	public List<String> getEmployeesNameByPlaneId(int id);
	public List<Integer> getPlaneIdByPilotLastName(String lastName);
	public List<Integer> getEmployeesIdByPlane(String loai1,String loai2);
	List<String> getPilotNameByPlaneName(String planeName);
	List<NhanVien> getListNhanVienNotIsPilot();
	long getPilotSalary();
}

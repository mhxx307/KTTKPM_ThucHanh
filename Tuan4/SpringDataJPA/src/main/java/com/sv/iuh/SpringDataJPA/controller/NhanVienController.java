package com.sv.iuh.SpringDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.iuh.SpringDataJPA.entity.NhanVien;
import com.sv.iuh.SpringDataJPA.service.NhanVienService;

@RestController
@RequestMapping("/api")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;
	
	@PostMapping("/NhanVien")
	public NhanVien saveNhanVien(@RequestBody NhanVien nhanVien) {
//		nhanVien.setMaNV("NV"+new Random().nextInt());
		nhanVienService.insertEmployee(nhanVien);
		return nhanVien;
	}
	
	@GetMapping("/NhanVien/{luong}")
	public List<NhanVien> findNhanVienByLuong(@PathVariable int luong) {
		return nhanVienService.findNhanVienByLuong(luong);
	}
	
	@GetMapping("/NhanVien/totalSalary")
	public int getTotalSalary() {
		return nhanVienService.getToTalSalary();
	}
	
	@GetMapping("/NhanVien/getEmployeesId/loai/{loai}")
	public List<Integer> getEmployeesIdByPlane(@PathVariable String loai) {
		return nhanVienService.getEmployeesIdByPlane(loai);
	}
	
	@GetMapping("/NhanVien/getEmployeesName/loai/{maMB}")
	public List<String> getEmployeesNameByPlaneId(@PathVariable int maMB) {
		return nhanVienService.getEmployeesNameByPlaneId(maMB);
	}
	
	@GetMapping("/NhanVien/getPlanesIdByPilotLastName/{lastName}")
	public List<Integer> getPlaneIdByPilotLastName(@PathVariable String lastName) {
		return nhanVienService.getPlaneIdByPilotLastName(lastName);
	}
	
	@GetMapping("/NhanVien/getEmployeesId/loai1-loai2/{loai1}-{loai2}")
	public List<Integer> getEmployeesIdByPlane(@PathVariable String loai1, @PathVariable String loai2) {
		return nhanVienService.getEmployeesIdByPlane(loai1, loai2);
	}
	
	@GetMapping("/NhanVien/getPilotNameByPlaneName/{planeName}")
	public List<String> getPilotNameByPlaneName(@PathVariable String planeName) {
		return nhanVienService.getPilotNameByPlaneName(planeName);
	}
	
	@GetMapping("/NhanVien/getListNhanVienNotIsPilot")
	public List<NhanVien> getListNhanVienNotIsPilot() {
		return nhanVienService.getListNhanVienNotIsPilot();
	}
	
	@GetMapping("/NhanVien/getPilotSalary")
	public long getPilotSalary() {
		return nhanVienService.getPilotSalary();
	}
}

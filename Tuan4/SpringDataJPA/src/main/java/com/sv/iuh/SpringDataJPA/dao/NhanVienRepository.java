package com.sv.iuh.SpringDataJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sv.iuh.SpringDataJPA.entity.NhanVien;

@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String> {

	// câu 3: tìm các nhân viên có lương nhỏ hơn 10000
	@Query("select u from NhanVien u where u.luong < :luong")
	List<NhanVien> findNhanVienByLuong(@Param("luong") int luong);

	// câu 8: cho biết tổng số lương phải trả cho nhân viên
	@Query("select SUM(u.luong) from NhanVien u")
//	@Query(value = "SELECT SUM(luong) FROM nhanvien", nativeQuery = true)
	int getToTalSalary();

	// câu 9: cho biết mã số của các phi công lái máy bay Boeing
	@Query(value = "select chungnhan.ma_nv from maybay \r\n"
			+ "inner join chungnhan ON maybay.ma_mb = chungnhan.ma_mb\r\n"
			+ "where maybay.loai like :loai%", nativeQuery = true)
	List<Integer> getEmployeesIdByPlane(@Param("loai") String loai);

	// câu 10: cho biết các nhân viên có thể lái máy bay có mã số 747
	@Query(value = "select nhanvien.ten from maybay \r\n" + "inner join chungnhan ON maybay.ma_mb = chungnhan.ma_mb\r\n"
			+ "inner join nhanvien ON chungnhan.ma_nv = nhanvien.ma_nv\r\n"
			+ "where maybay.ma_mb = :id", nativeQuery = true)
	List<String> getEmployeesNameByPlaneId(@Param("id") int id);

	// câu 11: cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
	@Query(value = "select chungnhan.ma_mb from chungnhan\r\n"
			+ "inner join nhanvien ON chungnhan.ma_nv = nhanvien.ma_nv\r\n"
			+ "where nhanvien.ten like :lastName%", nativeQuery = true)
	List<Integer> getPlaneIdByPilotLastName(@Param("lastName") String lastName);

	// câu 12: cho biết mã số của các phi công vừa lái máy bay Boeing vừa lái máy bay Airbus
	@Query(value = "select chungnhan.ma_nv from maybay \r\n"
			+ "inner join chungnhan ON maybay.ma_mb = chungnhan.ma_mb\r\n"
			+ "where maybay.loai like :loai1% OR maybay.loai like :loai2%", nativeQuery = true)
	List<Integer> getEmployeesIdByPlane(@Param("loai1") String loai1, @Param("loai2") String loai2);
	
	// câu 15: cho biết tên của các phi công lái máy bay boeing
	@Query(value = "select nhanvien.ten from nhanvien\r\n"
			+ "inner join chungnhan on chungnhan.ma_nv = nhanvien.ma_nv\r\n"
			+ "inner join maybay on chungnhan.ma_mb = maybay.ma_mb\r\n"
			+ "where maybay.loai LIKE :planeName%", nativeQuery = true)
	List<String> getPilotNameByPlaneName(@Param("planeName") String planeName);
	
	// câu 25: tìm các nhân viên không phải phi công
	@Query(value = "select nhanvien.ma_nv, nhanvien.ten, nhanvien.luong from nhanvien\r\n"
			+ "inner join chungnhan on chungnhan.ma_nv = nhanvien.ma_nv\r\n"
			+ "inner join maybay on chungnhan.ma_mb = maybay.ma_mb\r\n"
			+ "where nhanvien.ma_nv != chungnhan.ma_nv", nativeQuery = true)
	List<NhanVien> getListNhanVienNotIsPilot();
	
	// câu 27: cho biết tổng số lương phải trả cho các phi công
	@Query(value = "select sum(nhanvien.luong) from nhanvien\r\n"
			+ "inner join chungnhan on chungnhan.ma_nv = nhanvien.ma_nv\r\n"
			+ "inner join maybay on chungnhan.ma_mb = maybay.ma_mb\r\n"
			+ "where nhanvien.ma_nv = chungnhan.ma_nv", nativeQuery = true)
	long getPilotSalary();
}

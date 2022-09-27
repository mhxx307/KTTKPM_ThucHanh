package com.sv.iuh.SpringDataJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sv.iuh.SpringDataJPA.entity.NhanVien;


@Repository
public interface NhanVienRepository extends CrudRepository<NhanVien, String> {
	@Query("select u from NhanVien u where u.luong > :luong")
	List<NhanVien> findNhanVienByLuong(@Param("luong") int luong);
}	

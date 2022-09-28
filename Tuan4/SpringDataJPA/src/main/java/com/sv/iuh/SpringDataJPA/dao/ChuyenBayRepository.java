package com.sv.iuh.SpringDataJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sv.iuh.SpringDataJPA.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
	// câu 1: cho biết các chuyến bay đi đà lạt
	@Query("select u from ChuyenBay u where u.gaDen = :gaden")
	List<ChuyenBay> findChuyenBayByGaDen(@Param("gaden") String gaDen);
	
	// câu 4: cho biết chuyến bay có độ dài đường bay nhỏ hơn 10000 lớn hơn 8000
	@Query("select u from ChuyenBay u where u.doDai > :from and u.doDai < :to")
	List<ChuyenBay> findChuyenBayByDoDai(@Param("from") int from, @Param("to") int to);
	
	// câu 5: cho biết các chuyến bay từ sgn đi bmv
	@Query("select u from ChuyenBay u where u.gaDi = :from and u.gaDen = :to")
	List<ChuyenBay> findChuyenBayTheoViTri(@Param("from") String from, @Param("to") String to);
	
	// câu 6: có bao nhiêu chuyến bay xuất phát từ sài gòn
	@Query("select COUNT(u) from ChuyenBay u where u.gaDi = :gaDi")
	int countChuyenBayTheoDiemXuatPhat(@Param("gaDi") String gaDi);
	
	
}

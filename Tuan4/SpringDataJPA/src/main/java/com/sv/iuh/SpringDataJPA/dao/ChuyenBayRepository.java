package com.sv.iuh.SpringDataJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sv.iuh.SpringDataJPA.entity.ChuyenBay;

@Repository
public interface ChuyenBayRepository extends CrudRepository<ChuyenBay, String> {
	@Query("select u from ChuyenBay u where u.gaDen = :gaden")
	List<ChuyenBay> findChuyenBayByGaDen(@Param("gaden") String gaDen);
	
	@Query("select u from ChuyenBay u where u.doDai > :from and u.doDai < :to")
	List<ChuyenBay> findChuyenBayByDoDai(@Param("from") int from, @Param("to") int to);
	
	@Query("select u from ChuyenBay u where u.gaDi = :from and u.gaDen = :to")
	List<ChuyenBay> findChuyenBayTheoViTri(@Param("from") String from, @Param("to") String to);
}

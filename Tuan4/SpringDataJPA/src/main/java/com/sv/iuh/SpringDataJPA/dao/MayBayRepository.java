package com.sv.iuh.SpringDataJPA.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sv.iuh.SpringDataJPA.entity.MayBay;

@Repository
public interface MayBayRepository extends CrudRepository<MayBay, Integer> {
	// câu 2: cho biết các loại máy bay có tầm lớn hơn 10.000
	@Query("select u.loai from MayBay u where u.tamBay > 10000")
	List<String> findCacLoaiMayBayTheoTam(int tamBay);
	
	// câu 7: có bao nhiêu loại máy bay boeing
	@Query("select COUNT(u) from MayBay u where u.loai like :loai%")
	int countMayBayTheoLoai(@Param("loai") String loai);
	
	// câu 13: cho biết loại máy bay có thể thực hiện chuyến bay VN280
	@Query(value = "select maybay.loai from maybay where maybay.tam_bay > 11979", nativeQuery = true)
	List<String> getLoaiMayBayTheoChuyenBayVN280();
	
	
}

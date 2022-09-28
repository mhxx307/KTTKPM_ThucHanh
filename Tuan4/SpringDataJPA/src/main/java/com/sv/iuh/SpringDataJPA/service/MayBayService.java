package com.sv.iuh.SpringDataJPA.service;

import java.util.List;

public interface MayBayService {
	public List<String> findCacLoaiMayBayTheoTam(int tamBay);
	public int countMayBayTheoLoai(String loai);
	public List<String> getLoaiMayBayTheoChuyenBayVN280();
}

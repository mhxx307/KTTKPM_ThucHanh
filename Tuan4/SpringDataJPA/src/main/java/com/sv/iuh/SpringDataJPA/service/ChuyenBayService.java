package com.sv.iuh.SpringDataJPA.service;

import java.util.List;

import com.sv.iuh.SpringDataJPA.entity.ChuyenBay;

public interface ChuyenBayService {
	public List<ChuyenBay> findChuyenBayByGaDen(String gaDen);
}

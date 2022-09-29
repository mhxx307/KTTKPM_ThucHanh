package com.sv.iuh.SpringDataJPA.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.iuh.SpringDataJPA.dao.ChuyenBayRepository;
import com.sv.iuh.SpringDataJPA.entity.ChuyenBay;
import com.sv.iuh.SpringDataJPA.service.ChuyenBayService;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {

	private ChuyenBayRepository chuyenBayRepository;

	@Autowired
	public ChuyenBayServiceImpl(ChuyenBayRepository theRepository) {
		chuyenBayRepository = theRepository;
	}

	@Override
	@Transactional
	public List<ChuyenBay> findChuyenBayByGaDen(String gaDen) {
		List<ChuyenBay> listChuyenBay = chuyenBayRepository.findChuyenBayByGaDen(gaDen);
		return listChuyenBay;
	}

	@Override
	@Transactional
	public List<ChuyenBay> findChuyenBayByDoDai(int from, int to) {
		List<ChuyenBay> listChuyenBay = chuyenBayRepository.findChuyenBayByDoDai(from, to);
		return listChuyenBay;
	}

	@Override
	@Transactional
	public List<ChuyenBay> findChuyenBayByViTri(String from, String to) {
		return chuyenBayRepository.findChuyenBayTheoViTri(from, to);
	}

	@Override
	@Transactional
	public int countChuyenBayTheoDiemXuatPhat(String gaDi) {
		return chuyenBayRepository.countChuyenBayTheoDiemXuatPhat(gaDi);
	}

	@Override
	@Transactional
	public List<ChuyenBay> getListChuyenBayKhoiHanhTruoc12h() {
		return chuyenBayRepository.getListChuyenBayKhoiHanhTruoc12h();
	}

}

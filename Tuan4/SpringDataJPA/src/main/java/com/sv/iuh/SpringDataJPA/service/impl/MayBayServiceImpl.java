package com.sv.iuh.SpringDataJPA.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.iuh.SpringDataJPA.dao.MayBayRepository;
import com.sv.iuh.SpringDataJPA.service.MayBayService;

@Service
public class MayBayServiceImpl implements MayBayService {
	
	private MayBayRepository mayBayRepository;
	
	@Autowired
	public MayBayServiceImpl(MayBayRepository theRepository) {
		mayBayRepository = theRepository;
	}

	@Override
	@Transactional
	public List<String> findCacLoaiMayBayTheoTam(int tamBay) {
		return mayBayRepository.findCacLoaiMayBayTheoTam(tamBay);
	}

	@Override
	@Transactional
	public int countMayBayTheoLoai(String loai) {
		return mayBayRepository.countMayBayTheoLoai(loai);
	}

	@Override
	@Transactional
	public List<String> getLoaiMayBayTheoChuyenBayVN280() {
		return mayBayRepository.getLoaiMayBayTheoChuyenBayVN280();
	}

}

package com.sv.iuh.SpringDataJPA.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sv.iuh.SpringDataJPA.dao.ChuyenBayRepository;
import com.sv.iuh.SpringDataJPA.entity.ChuyenBay;

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

}

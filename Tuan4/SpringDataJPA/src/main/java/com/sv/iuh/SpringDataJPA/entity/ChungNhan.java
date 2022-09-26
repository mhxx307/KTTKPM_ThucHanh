package com.sv.iuh.SpringDataJPA.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan {
	@Id
	@ManyToOne
	@JoinColumn(name = "ma_nv", columnDefinition = "VARCHAR(100)")
	private NhanVien nhanVien;

	@Id
	@ManyToOne
	@JoinColumn(name = "ma_mb", columnDefinition = "integer")
	private MayBay mayBay;

	public ChungNhan() {
		super();
	}

	public ChungNhan(NhanVien nhanVien, MayBay mayBay) {
		super();
		this.nhanVien = nhanVien;
		this.mayBay = mayBay;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public MayBay getMayBay() {
		return mayBay;
	}

	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}

}

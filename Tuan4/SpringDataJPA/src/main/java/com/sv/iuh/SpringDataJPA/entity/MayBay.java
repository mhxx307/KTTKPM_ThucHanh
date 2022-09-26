package com.sv.iuh.SpringDataJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {
	@Id
	@GeneratedValue
	@Column(name = "ma_mb")
	private int maMB;

	@Column(name = "loai")
	private String loai;

	@Column(name = "tam_bay")
	private int tamBay;

	public MayBay() {
		super();
	}

	public MayBay(int maMB, String loai, int tamBay) {
		super();
		this.maMB = maMB;
		this.loai = loai;
		this.tamBay = tamBay;
	}

	public int getMaMB() {
		return maMB;
	}

	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getTamBay() {
		return tamBay;
	}

	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}

}

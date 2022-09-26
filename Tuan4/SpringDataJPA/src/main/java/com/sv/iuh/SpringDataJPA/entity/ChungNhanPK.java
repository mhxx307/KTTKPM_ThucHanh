package com.sv.iuh.SpringDataJPA.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class ChungNhanPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nhanVien;
	private int mayBay;

	public ChungNhanPK() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(mayBay, nhanVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChungNhanPK other = (ChungNhanPK) obj;
		return mayBay == other.mayBay && Objects.equals(nhanVien, other.nhanVien);
	}

}

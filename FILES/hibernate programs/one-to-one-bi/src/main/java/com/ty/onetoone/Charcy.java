package com.ty.onetoone;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Cacheable
public class Charcy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String charcyNumber;
	private String type;
	@OneToOne(mappedBy = "charcy")
	private Vehicl vehicl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCharcyNumber() {
		return charcyNumber;
	}
	public void setCharcyNumber(String charcyNumber) {
		this.charcyNumber = charcyNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Vehicl getVehicl() {
		return vehicl;
	}
	public void setVehicl(Vehicl vehicl) {
		this.vehicl = vehicl;
	}
}

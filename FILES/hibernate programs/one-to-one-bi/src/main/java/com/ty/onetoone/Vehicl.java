package com.ty.onetoone;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Cacheable
public class Vehicl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double cost;
	//@OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name = "charcy_id")
	private Charcy charcy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Charcy getCharcy() {
		return charcy;
	}
	public void setCharcy(Charcy charcy) {
		this.charcy = charcy;
	}
	
}

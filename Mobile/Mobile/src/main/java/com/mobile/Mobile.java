package com.mobile;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="MobileDetails")
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="MobileID")
	private int id;
	@Column(name="MobileName",nullable = false)
	private String name;
	@Column(name="MobileCost")
	private double cost;
	@Column(name="MobileColor",unique = true)
	private String color;
	@CreationTimestamp
	private LocalDateTime time;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	

}

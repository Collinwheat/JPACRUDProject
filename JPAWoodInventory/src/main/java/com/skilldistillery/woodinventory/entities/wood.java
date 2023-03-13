package com.skilldistillery.woodinventory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Wood")
public class wood {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String species;

	@Column(name = "length_inches")
	private int length;

	@Column(name = "thickness_inches")
	private int thickness;

	@Column(name = "width_inches")
	private int width;

	private String type;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public wood() {

	}

	@Override
	public String toString() {
		return "wood [id=" + id + ", species=" + species + ", length=" + length + ", thickness=" + thickness
				+ ", width=" + width + ", type=" + type + "]";
	}

}

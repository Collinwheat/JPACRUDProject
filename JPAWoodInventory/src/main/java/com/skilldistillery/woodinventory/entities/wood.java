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

	private String dimensions;

	private String type;

	@Column(name = "image_url")
	private String imageUrl;

	public wood() {
		
	}

	@Override
	public String toString() {
		return "Wood [id=" + id + ", species=" + species + ", dimensions=" + dimensions + ", type=" + type
				+ ", imageUrl=" + imageUrl + "]";
	}

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

	public String getDimensions() {
		return dimensions;
	}

	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}

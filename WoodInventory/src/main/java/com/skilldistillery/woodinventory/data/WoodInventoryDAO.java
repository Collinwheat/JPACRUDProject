package com.skilldistillery.woodinventory.data;

import java.util.List;

import com.skilldistillery.woodinventory.entities.wood;

public interface WoodInventoryDAO {

	wood findById(int woodId);
		
	List<wood> findAll();
	
	wood create(wood wood);
	
	wood update(String woodName, wood wood);
	
	boolean deleteById(int woodId);
	
	
}

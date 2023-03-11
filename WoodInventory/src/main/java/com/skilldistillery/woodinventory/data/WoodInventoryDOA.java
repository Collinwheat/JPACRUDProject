package com.skilldistillery.woodinventory.data;

import java.util.List;

import com.skilldistillery.woodinventory.entities.wood;

public interface WoodInventoryDOA {

	wood findById(int woodId);
		
	List<wood> findAll();
	
	wood create(wood wood);
	
	wood update(int woodId, wood wood);
	
	boolean deleteById(int woodId);
	
	
}

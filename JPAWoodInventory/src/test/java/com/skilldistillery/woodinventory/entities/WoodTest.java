package com.skilldistillery.woodinventory.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class WoodTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private wood wood;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPAWoodInventory");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		wood = em.find(wood.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		wood = null;
	}

	@Test
	void test_Wood_entity_mapping() {
		assertNotNull(wood);
		assertEquals("walnut", wood.getSpecies());
		assertEquals(27, wood.getLength());
		assertEquals(1, wood.getThickness());
		assertEquals(10, wood.getWidth());
		assertEquals("hardwood", wood.getType());
		
		
	}

}

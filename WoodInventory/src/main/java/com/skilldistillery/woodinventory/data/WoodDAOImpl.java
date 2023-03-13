package com.skilldistillery.woodinventory.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.woodinventory.entities.wood;

@Service
@Transactional
public class WoodDAOImpl implements WoodInventoryDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public wood findById(int woodId) {
		return em.find(wood.class, woodId);
	}

	@Override
	public List<wood> findAll() {
		String jpql = "SELECT c FROM wood c";
		
		List<wood> allWoodInventory = em.createQuery(jpql, wood.class).getResultList();
		
		
		return allWoodInventory;
		
	}
	//REMINDER
		//NO BEGIN/COMMIT
		//NO EM.CLOSE
	@Override
	public wood create(wood wood) {
		em.persist(wood);
		return wood;
	}
	@Override
	public wood update(String updateWood, wood wood) {
		em.remove(findById(wood.getId()));
		em.persist(wood);
		return wood;
	}

	@Override
	public boolean deleteById(int woodId) {
		boolean removed = false;
		
		wood woodRemoving = em.find(wood.class, woodId);
		
		if (woodRemoving != null) {
			em.remove(woodRemoving);
			removed = !em.contains(woodRemoving);
		}
		return removed;
	}

}

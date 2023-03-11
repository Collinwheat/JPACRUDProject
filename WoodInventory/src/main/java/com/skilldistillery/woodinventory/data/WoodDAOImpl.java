package com.skilldistillery.woodinventory.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.woodinventory.entities.wood;

@Service
@Transactional
public class WoodDAOImpl implements WoodInventoryDOA {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public wood findById(int woodId) {
		return em.find(wood.class, woodId);
	}

	@Override
	public List<wood> findAll() {
		String jpql = "SELECT c FROM wood c";
		return em.createQuery(jpql, wood.class).getResultList();
	}
	//REMINDER
		//NO BEGIN/COMMIT
		//NO EM.CLOSE
	@Override
	public wood create(wood wood) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public wood update(int woodId, wood wood) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int woodId) {
		// TODO Auto-generated method stub
		return false;
	}

}

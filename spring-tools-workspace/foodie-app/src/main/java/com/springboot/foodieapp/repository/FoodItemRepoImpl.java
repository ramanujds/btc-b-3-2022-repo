package com.springboot.foodieapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.springboot.foodieapp.model.FoodItem;

@Repository
public class FoodItemRepoImpl implements IFoodItemRepo {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public FoodItem saveFoodItem(FoodItem item) {
		em.persist(item);
		return item;
	}

	@Override
	public FoodItem findFoodItem(long itemCode) {
		FoodItem item = em.find(FoodItem.class, itemCode);
		return item;
	}

	@Override
	public FoodItem updateFoodItem(FoodItem item) {
		return em.merge(item);
	}

	@Override
	public boolean deleteFoodItem(long itemCode) {
		FoodItem item = em.find(FoodItem.class, itemCode);
		if(item==null) {
			return false;
		}
		em.remove(item);
		return true;
	}

	@Override
	public List<FoodItem> getAllItems() {
		Query findAll = em.createQuery("from FoodItem");
		List<FoodItem> items = findAll.getResultList();
		return items;
	}

	
	
}

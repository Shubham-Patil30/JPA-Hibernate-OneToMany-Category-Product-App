 package com.ait.otm.dao.impl;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.entities.CategoryEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CategoryDAOImpl implements CategoryDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test"); 
	
		
	@Override
	public void saveCategory(CategoryEntity category) {
	    EntityManager entityManager = factory.createEntityManager();
	    EntityTransaction tx = entityManager.getTransaction(); 
	    tx.begin();
	    try {
	        // Check if the category already exists
	        CategoryEntity existingCategory = entityManager.find(CategoryEntity.class, category.getCategoryId());
	        if (existingCategory != null) {
	            // If exists, update using merge
	            System.out.println("Category already exists, updating...");
//	            entityManager.merge(category);  // Uncomment this line to enable updating
	        } else {
	            // Otherwise, persist as new
	            entityManager.persist(category);
	            System.out.println("Category added successfully to the database");
	        }
	        tx.commit();  // Move commit outside to ensure it is called in both cases
	    } catch (Exception e) {
	        if (tx.isActive()) {
	            tx.rollback();
	        }
	        System.out.println("Cannot add the category");
	        e.printStackTrace();
	    } finally {
	        entityManager.close();
	    }
	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		CategoryEntity catg = em.find(CategoryEntity.class,categoryId);
		if(catg != null) {
			em.close();
			return catg; 
		}
		else {
			System.out.println("category not found");
		}
		return null;
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		CategoryEntity catg = em.find(CategoryEntity.class,categoryId);
		try {
			if(catg != null) {
				em.remove(catg);
				tx.commit();
				em.close();
				System.out.println(catg.getCategoryName()+" "+"category successfully removed from db");
			}
			else {
				System.out.println("category not found");
			}
			
		} catch (Exception e) {
			tx.rollback();
			System.out.println("some error occures can not remove category");
		}
		
	}

	}



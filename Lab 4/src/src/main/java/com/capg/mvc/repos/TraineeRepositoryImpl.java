package com.capg.mvc.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capg.mvc.entities.Trainee;

@Repository
public class TraineeRepositoryImpl implements TraineeRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	public Trainee addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
		return trainee;
	}

	public void editTrainee(Trainee trainee) {
		entityManager.merge(trainee);		
	}

	public void deleteTrainee(long id) {
		Trainee trainee = entityManager.find(Trainee.class, id);
		entityManager.remove(trainee);		
	}

	public Trainee getTrainee(long id) {
		Trainee trainee = entityManager.find(Trainee.class, id);
		return trainee;
	}

	public List<Trainee> getAllTrainees() {
		Query query = entityManager.createQuery("select t.id, t.name, t.loc, t.dom from Trainee t");
		List allTrainees=query.getResultList();
		return allTrainees;
	}

}

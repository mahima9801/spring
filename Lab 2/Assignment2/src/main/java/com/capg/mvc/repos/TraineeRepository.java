package com.capg.mvc.repos;

import java.util.List;

import com.capg.mvc.entities.Trainee;

public interface TraineeRepository {
	Trainee addTrainee(Trainee trainee);
	void editTrainee(Trainee trainee);
	void deleteTrainee(long id);
	Trainee getTrainee(long id);
	List<Trainee> getAllTrainees();
}

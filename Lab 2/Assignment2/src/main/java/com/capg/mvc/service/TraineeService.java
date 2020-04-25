package com.capg.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.mvc.entities.Trainee;

public interface TraineeService {
	Trainee newTrainee(Trainee trainee);
	void deleteTrainee(long id);
	void modifyTrainee(Trainee trainee);
	Trainee retrieveTrainee(long id);
	List<Trainee> retriveAll();
}

package com.capg.mvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.mvc.entities.Trainee;
import com.capg.mvc.repos.TraineeRepository;

@Service
public class TraineeServiceImpl implements TraineeService{

	@Autowired
	private TraineeRepository traineeRepository;
	
	@Transactional
	public Trainee newTrainee(Trainee trainee) {
		return traineeRepository.addTrainee(trainee);
	}

	public void deleteTrainee(long id) {
		Trainee savedTrainee=traineeRepository.getTrainee(id);
		if(savedTrainee!=null) {
			traineeRepository.deleteTrainee(id);
	}
	}

	public void modifyTrainee(Trainee trainee) {
		Trainee savedTrainee=traineeRepository.getTrainee(trainee.getTraineeId());
		if(savedTrainee!=null) {
			traineeRepository.editTrainee(trainee);
		}
	}

	public Trainee retrieveTrainee(long id) {
		return traineeRepository.getTrainee(id);
	}

	public List<Trainee> retriveAll() {
		return traineeRepository.getAllTrainees();
	}

}

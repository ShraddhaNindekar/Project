package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Trainee;
import com.example.demo.repository.TraineeRepository;

@Service
public class TraineeService {

    @Autowired 
    private TraineeRepository traineeRepository;

    // Get all trainees
    public List<Trainee> getAllTrainees() {
        return traineeRepository.findAll();
    }

    // Add new trainee
    public void addTrainee(Trainee trainee) {
        traineeRepository.save(trainee);
    }

    // Get trainee by id
    public Trainee getTraineeByTid(int tid) {
        return traineeRepository.findById(tid).orElse(new Trainee());
    }

    // Update trainee
    public void updateTrainee(Trainee trainee) {
        traineeRepository.save(trainee);
    }

    // Delete trainee by id
    public void deleteTrainee(int tno) {
        traineeRepository.deleteById(tno);
    }

	public void updateStudent(Trainee trainee) {
		// TODO Auto-generated method stub
		
	}
}

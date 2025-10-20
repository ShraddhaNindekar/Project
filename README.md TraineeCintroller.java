package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Trainee;
import com.example.demo.service.TraineeService;

@RestController
public class TraineeController {
	@Autowired TraineeService traineeservice;
	
	@GetMapping("/trainees")
	public List<Trainee> getAllTrainees(){
		return traineeservice.getAllTrainees();
	}
	
	@PostMapping("/addTrainee")
	public String addStudent(@RequestBody Trainee trainee) {
		traineeservice.updateStudent(trainee);
		return "trainee data added";
			}
	
	@GetMapping("/Trainee/{tid}")
	public Trainee getTrainee(@PathVariable("tid") int tid) {
		return traineeservice.getTraineeByTid(tid);
	}
	
	//update trainee data
	@PutMapping("/updateTrainee")
	public String updateTrainee(@RequestBody Trainee trainee) {
		traineeservice.updateStudent(trainee);
		return "trainee data updated";
	}
	
	@DeleteMapping("/deleteTrainee/{tno}")
	public String deleteTrainee(@PathVariable("tno") int tno) {
		traineeservice.deleteTrainee(tno);
		return "trainee data deleted";
	}
}

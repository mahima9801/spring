package com.capg.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.mvc.entities.Trainee;
import com.capg.mvc.exception.InvalidLoginException;
import com.capg.mvc.exception.TraineeNotFoundException;
import com.capg.mvc.service.TraineeService;

@Controller
public class TraineeController {
		
	@Autowired
	private TraineeService traineeService;
	
	@RequestMapping("/login")
	public String login(@RequestParam("name") String user, @RequestParam("pass") String pass) throws InvalidLoginException {
		if(user.equals("mahima")&& pass.equals("mahima")) {
			return "display";
		}
		else {
			throw new InvalidLoginException();
		}
	}
	@RequestMapping("/addtrainee")
	public String add() {
		return "addtrainee";
		
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("trainee")Trainee trainee,ModelMap modelMap) {
		Trainee savedTrainee=traineeService.newTrainee(trainee);
		if(savedTrainee!=null) {
			modelMap.addAttribute("msg", "Trainee added with id"+savedTrainee.getTraineeId());
			}
		else {
			modelMap.addAttribute("msg", "Trainee not added");
		}
		return "addtrainee";
	}
	
	@RequestMapping("/deletetrainee")
	public String delete() {
		return "deletetrainee";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String traineedelete(@RequestParam("traineeId") long id, ModelMap modelMap) {
		Trainee trainee = traineeService.retrieveTrainee(id);
		modelMap.addAttribute("del", trainee);
		return "deletetrainee";
		
	}
	@RequestMapping(value="/deletetrainee/{traineeId}",method=RequestMethod.POST)
	public String delete(@PathVariable("traineeId") int traineeId, ModelMap modelMap) {
		traineeService.deleteTrainee(traineeId);;
		return "deleteTrainee";
	}
	
	@RequestMapping(value="/modifytrainee", method=RequestMethod.GET)
	public String modify() {
		return "modifytrainee";
	}
	
	@RequestMapping(value="/modify",method=RequestMethod.POST)
	public String modifyById(@RequestParam("traineeId") long id, ModelMap modelMap) {
		Trainee trainee=traineeService.retrieveTrainee(id);
		modelMap.addAttribute("val",trainee);
		return "modifytrainee";
	}
	
	@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
	public String modify(@ModelAttribute("trainee") Trainee trainee, ModelMap modelMap) {
		traineeService.modifyTrainee(trainee);
		modelMap.addAttribute("msg","Trainee "+trainee.getTraineeId()+" modified");
		return "modifytrainee";
	}
	
	@RequestMapping("/retrieve")
	public String retrieve(@RequestParam("traineeId") long id,Model model) throws TraineeNotFoundException
	{
		Trainee trainee=traineeService.retrieveTrainee(id);
		if(trainee==null)
		{
			throw new TraineeNotFoundException();
		}
		model.addAttribute("msg",trainee);
		
		return "retrieve";
		
	}
	@RequestMapping(value="/retrieveall",method=RequestMethod.GET)
	public String retrieveall(ModelMap modelMap) {
		List<Trainee> list=traineeService.retriveAll();
		modelMap.addAttribute("list", list);
		return "retrieveall";
	}
	
}

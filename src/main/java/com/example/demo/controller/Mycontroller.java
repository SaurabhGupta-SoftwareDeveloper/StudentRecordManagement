package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.Student;
import com.example.demo.service.Myservice;

@Controller
public class Mycontroller {
@Autowired
Myservice sMyservice;
	
@GetMapping("/")
public String load() {
	return "first";
}
@GetMapping("/insert")
public String loadAdd() {
	return "Add";
	
}
@GetMapping("/fetch")
public String loadfetch(ModelMap map) {
	return sMyservice.fetch(map);
	
}
@PostMapping("/loadvalue")
public String Loadvalue(Student s ,ModelMap map) {
	return  sMyservice.print(s ,map);
}
@GetMapping("/delete")
public String DeleteTask(@RequestParam int id,ModelMap map) {
	return sMyservice.deleteTask(id,map);
}
@GetMapping("/Edit")
public String EditTask(@RequestParam int id, ModelMap map) {
	return sMyservice.editTask(id,map);
}
@PostMapping("/edit")
public String EditTask1(Student student, ModelMap map) {
	return sMyservice.editTask1(student,map);
}
}

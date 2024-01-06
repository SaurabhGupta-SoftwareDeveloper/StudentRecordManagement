package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.example.demo.dao.StudentDao;
import com.example.demo.dto.Student;


@Component
public class Myservice {
	@Autowired
	StudentDao dao;

	public String print(Student s, ModelMap map) {
		
		
     	s.setPercentage((s.getEnglish()+s.getMaths()+s.getScience())/3.0);
		
		if(s.getMaths() >35 && s.getEnglish() >35 && s.getScience()>35) {
			map.put("msg", "You Are Pass The Exam");
			if(s.getPercentage()>=85) {
			s.setResult("Distinction");
			}else if(s.getPercentage()>=60) {
				s.setResult("first class");
				}else {
					s.setResult("Second Class");
				}
		}else {
			map.put("msg", "You Are Not Cleared The Exam");
			s.setResult("Fail");
		}
		map.put("msg", "Record added ");
		dao.save(s);
		return "first";
		
	}

	public String fetch(ModelMap map) {
	    List<Student> list=  dao.fetched();
	    if(list.isEmpty()) {
	    	map.put("fail","no data");
	    	return "first";
	    }else {
	     	map.put("list",list);
	    	return "fetch";
	    }
	    
	}

	public String deleteTask(int id, ModelMap map) {
		dao.findById(id);
		
		 
		return fetch(map);
	}

	public String editTask(int id, ModelMap map) {
		 Student student=dao.findingById(id);
		 map.put("student",student);
		return "Edit";
	}

	public String editTask1(Student s, ModelMap map) {
		
     	s.setPercentage((s.getEnglish()+s.getMaths()+s.getScience())/3.0);
		
		if(s.getMaths() >35 && s.getEnglish() >35 && s.getScience()>35) {
			map.put("msg", "You Are Pass The Exam");
			if(s.getPercentage()>=85) {
			s.setResult("Distinction");
			}else if(s.getPercentage()>=60) {
				s.setResult("first class");
				}else {
					s.setResult("Second Class");
				}
		}else {
			map.put("msg", "You Are Not Cleared The Exam");
			s.setResult("Fail");
		}
		map.put("msg", "Record added ");
		dao.save(s);
		return fetch(map);
	}


    
}

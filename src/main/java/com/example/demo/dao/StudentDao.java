package com.example.demo.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.Student;
import com.example.demo.repository.Myreprositry;
@Component
public class StudentDao {
	@Autowired
	Myreprositry myreprositry;
    
	public void save(Student s) {
	    
		myreprositry.save(s);
	}

	public List<Student> fetched() {
	    return myreprositry.findAll();
		
	}


	public void findById(int id) {
		
	   myreprositry.deleteById(id);;
		
	}

	public Student findingById(int id) {
		
		return myreprositry.findById(id).get();
	}

	public void update(Student student) {
		myreprositry.save(student);
		
	}

	

     
     
     
     
}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.dto.Student;


public interface Myreprositry extends JpaRepository<Student, Integer> {

	

	

}

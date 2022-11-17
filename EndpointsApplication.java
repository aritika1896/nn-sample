package com.nn.sample.endpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EndpointsApplication {
	
	private final StudentRepository studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(EndpointsApplication.class, args);
	}

	@PostMapping("/student")
	Student createStudent(@RequestBody Student newStudent) {
		return studentRepo.save(newStudent);
	}
	
	@GetMapping("/student/{id}")
	Student getDetails(@PathVariable Long id) {
		return studentRepo.findById(id);
	}
	
	@PutMapping("/student/{id}")
	Student update(@RequestBody Student updateStudent, @PathVariable Long id) {
		Student st = studentRepo.findById(id);
		st.setAge(updateStudent.getAge());
		st.setName(updateStudent.getName());
		studentRepo.save(st);
	}
}

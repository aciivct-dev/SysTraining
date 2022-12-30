package com.example.application.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.application.entity.Apply;
import com.example.application.repository.ApplicationRepository;

@RestController
@CrossOrigin(origins = "*")
@EnableAutoConfiguration
@RequestMapping("/applicants")

public class ApplicationController {
	@Autowired
	ApplicationRepository repos;

	@PostMapping
	public Apply addBook(@RequestBody Apply applyObj) {
		return repos.save(applyObj);
	}

	@GetMapping
	public List<Apply> getApply() {
		return repos.findAll();
	}

	@PutMapping("/{id}") // Updating Data
	public Apply updateApplication(@PathVariable(value = "id") Integer id, @RequestBody Apply app) {
		Optional<Apply> isExist = repos.findById(id);
		if (isExist.isPresent()) {
			isExist.get().setName(app.getName());
			isExist.get().setDob(app.getDob());
			isExist.get().setAddress(app.getAddress());
			isExist.get().setAge(app.getAge());
			isExist.get().setGender(app.getGender());
			isExist.get().setEmail(app.getEmail());
			isExist.get().setMobile(app.getMobile());
			isExist.get().setAadhar_no(app.getAadhar_no());
			isExist.get().setPancard(app.getPancard());
			isExist.get().setAmount_req(app.getAmount_req());
			isExist.get().setHouse_type(app.getHouse_type());
			isExist.get().setEmployee_type(app.getEmployee_type());
			
			return repos.save(isExist.get());
		}
		return null;
	}

	@DeleteMapping("/{id}") // Delete Data
	public void deleteBook(@PathVariable(value = "id") Integer id) {
		repos.deleteById(id);
	}
}

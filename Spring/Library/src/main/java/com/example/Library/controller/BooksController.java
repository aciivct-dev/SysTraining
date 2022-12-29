package com.example.Library.controller;

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
import com.example.Library.entity.Books;
import com.example.Library.repository.BooksRepository;


@RestController
@CrossOrigin(origins="*")
@EnableAutoConfiguration
@RequestMapping("/books")
public class BooksController {
	@Autowired // automatically create book object for interface
	 BooksRepository repo;
	

	@PostMapping // Insert data
	public Books addBook(@RequestBody Books bookObj) {
		return repo.save(bookObj);
	}

	@GetMapping // retrive data
	public List<Books> getBooks() {
		return repo.findAll();
	}

	@PutMapping("/{id}") // Updating Data
	public Books updateBook(@PathVariable(value = "id") Integer id, @RequestBody Books bookObj) {
		Optional<Books> isExist = repo.findById(id);
		if (isExist.isPresent()) {
			isExist.get().setName(bookObj.getName());
			isExist.get().setAuthor(bookObj.getAuthor());
			isExist.get().setPrice(bookObj.getPrice());
			return repo.save(isExist.get());
		}
		return null;
	}
	@DeleteMapping("/{id}") //Delete Data
	public void deleteBook(@PathVariable(value="id") Integer id)
	{
		repo.deleteById(id);
	}

}

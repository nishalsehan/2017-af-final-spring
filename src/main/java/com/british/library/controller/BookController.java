package com.british.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.british.library.model.books;
import com.british.library.repository.BookRepository;

@RestController
@RequestMapping("/books")
public class BookController {

	
	@Autowired
	BookRepository repository;
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/AuthorBooks/{id}")
	public List<books> getBooks(@PathVariable("id") String id){
		ArrayList<books> allBooks = (ArrayList<books>) repository.findAll();
		
		ArrayList<books> authorBooks = new ArrayList<books>();
		
		for(books book:allBooks) {
			if(book.getAuthor().equals(id)) {
				authorBooks.add(book);
			}
		}
		return authorBooks;
		
	}
	
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/")
	public List<books> getAll(){
		
		return repository.findAll();
		
	}
	
	@CrossOrigin("http://localhost:3000")
	@PutMapping("/getTotal")
	public double getTotal(@RequestBody ArrayList<ObjectId> id){
		System.out.println(id.size());
		
		double total = 0;
		for(int i=0;i<id.size();i++) {
			System.out.println(id.get(i));
			
			books book = repository.findBy_id(id.get(i));
			total+=book.getPrice();
		}
		return total;
	}
}

package com.british.library.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.british.library.model.books;

public interface BookRepository extends MongoRepository<books,String> {

	books findBy_id(ObjectId id);
}

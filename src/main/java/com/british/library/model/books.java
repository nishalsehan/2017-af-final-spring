package com.british.library.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class books {

	@Id
	ObjectId _id;
	String name;
	double ISBN;
	String Author;
	Double price;
	String YearOfPub;
	String Publisher;
	public books() {
		super();
	}
	public books(ObjectId _id, String name, double ISBN, String author, Double price, String yearOfPub, String publisher) {
		super();
		this._id = _id;
		this.name = name;
		this.ISBN = ISBN;
		Author = author;
		this.price = price;
		YearOfPub = yearOfPub;
		Publisher = publisher;
	}
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getIsbm() {
		return ISBN;
	}
	public void setIsbm(double ISBN) {
		this.ISBN = ISBN;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getYearOfPub() {
		return YearOfPub;
	}
	public void setYearOfPub(String yearOfPub) {
		YearOfPub = yearOfPub;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	
	
	
	
}

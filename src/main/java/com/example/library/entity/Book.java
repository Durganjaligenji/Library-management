package com.example.library.entity;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.Table;

@Entity
@Table(name="books")

public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	@ManyToMany
	@JoinTable(name ="books_authors", joinColumns = {@JoinColumn(name = "book_id")},
	            inverseJoinColumns = {@JoinColumn(name="author_id")})
	
	private List<Author> authors ;
	@JoinTable(name ="books_categories", joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name="category_id")})
	@ManyToMany
	private List<Category> categories;
	@JoinTable(name ="books_publishers", joinColumns = {@JoinColumn(name = "book_id")},
            inverseJoinColumns = {@JoinColumn(name="publishers_id")})
	@ManyToMany
	private List <Publisher> publishers;
	public Book() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<Publisher> getPublishers() {
		return publishers;
	}
	public void setPublishers(List<Publisher> publishers) {
		this.publishers = publishers;
	}
   
     
}

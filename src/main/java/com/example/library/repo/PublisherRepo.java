package com.example.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.library.entity.Publisher;


public interface PublisherRepo extends JpaRepository<Publisher,Integer>{

}

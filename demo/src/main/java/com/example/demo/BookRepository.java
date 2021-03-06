package com.example.demo;

import Models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface BookRepository extends MongoRepository<Book, Integer> {


}
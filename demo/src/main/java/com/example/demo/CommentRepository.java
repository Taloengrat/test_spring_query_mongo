package com.example.demo;

import Models.Book;
import Models.Comments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CommentRepository extends MongoRepository<Comments, String> {
}

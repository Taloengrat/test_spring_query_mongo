package com.example.demo;

import Models.Book;

import Models.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private BookRepository repository;

    @Autowired
    private CommentRepository commentRepository;


    @RequestMapping("/allUsers")
    private List<Book> getAllUser()
    {
        return repository.findAll();
    }

    @PostMapping("addBook")
    private String saveBook(@RequestBody Book book){
        repository.save(book);
        return "Add User with id : "+ book.getId();
    }

    @RequestMapping("/allComments")
    private List<Comments> getAllComments()
    {
        return commentRepository.findAll();
    }

}

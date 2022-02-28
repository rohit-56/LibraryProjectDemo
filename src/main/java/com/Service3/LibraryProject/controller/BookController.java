package com.Service3.LibraryProject.controller;

import com.Service3.LibraryProject.services.BookServices;
import com.Service3.LibraryProject.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookServices bookServices;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks(){
        List<Book> list=bookServices.getAllBooks();
        if(list.size()<=0)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(list);
    }

    @PostMapping("/books")
    public ResponseEntity addBooks(@RequestBody Book b1){
        System.out.println("heeelo");
        bookServices.addBookDetails(b1);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }



}

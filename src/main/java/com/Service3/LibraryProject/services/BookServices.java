package com.Service3.LibraryProject.services;

import com.Service3.LibraryProject.Repository.BookRepository;
import com.Service3.LibraryProject.entities.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BookServices {



    @Autowired
    private BookRepository bookRepository;


    public Book getBookDetails(int id){
        return (Book)bookRepository.findById(id);

    }
    public List<Book> getAllBooks(){
        return (List<Book>) bookRepository.findAll();
    }

    public void addBookDetails(Book b1){
        bookRepository.save(b1);
    }
}

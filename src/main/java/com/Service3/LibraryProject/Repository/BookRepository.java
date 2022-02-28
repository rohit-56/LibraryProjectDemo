package com.Service3.LibraryProject.Repository;

import com.Service3.LibraryProject.entities.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public interface BookRepository extends CrudRepository<Book,Integer> {

   public Book findById(int id);
}

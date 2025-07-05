package com.library.LibraryManagement.service;
import com.library.LibraryManagement.repository.BookRepository;

//BookService.java


public class BookService {
 private BookRepository bookRepository;

 public void setBookRepository(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }

 public void printBookTitle() {
     System.out.println("Book: " + bookRepository.getBookTitle());
 }
}


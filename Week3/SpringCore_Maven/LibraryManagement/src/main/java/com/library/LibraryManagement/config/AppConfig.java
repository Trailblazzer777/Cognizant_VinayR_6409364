package com.library.LibraryManagement.config;


import com.library.LibraryManagement.repository.BookRepository;
import com.library.LibraryManagement.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        BookService service = new BookService();
        service.setBookRepository(bookRepository()); // Dependency Injection
        return service;
    }
}

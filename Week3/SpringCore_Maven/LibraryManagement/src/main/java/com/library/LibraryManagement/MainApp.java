package com.library.LibraryManagement;

import com.library.LibraryManagement.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.library.LibraryManagement.service.BookService;

public class MainApp {
	 public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        BookService bookService = context.getBean(BookService.class);
	        bookService.printBookTitle();
	    }
}

package it.merigreis.mylibrary.service;

import it.merigreis.mylibrary.model.Book;
import it.merigreis.mylibrary.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService (BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void addBook(Book newBook){
        bookRepository.save(newBook);
    }

    public List<Book> showAllBooks(){
        return bookRepository.findAll();
    }
    public Book showBookById(Long id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        if(bookOptional.isEmpty()) return null;
        else return bookOptional.get();
    }
}

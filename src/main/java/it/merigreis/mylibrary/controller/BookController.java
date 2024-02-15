package it.merigreis.mylibrary.controller;

import it.merigreis.mylibrary.model.Book;
import it.merigreis.mylibrary.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @PostMapping("/addBook")
    public ResponseEntity<Void> addNewBook(@RequestBody Book newBook){
        bookService.addBook(newBook);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/allBooks")
    public ResponseEntity<List<Book>> viewAll(){
        List<Book> books = bookService.showAllBooks();
        if(books.isEmpty()){
            return ResponseEntity.noContent().build();
        } else return ResponseEntity.ok(books);
    }
    @GetMapping("/bookById/{id}")
    public ResponseEntity<Book> viewBookById(@PathVariable Long id){
        Book book = bookService.showBookById(id);
        if(book==null) return ResponseEntity.noContent().build();
        else return ResponseEntity.ok(book);
    }
}

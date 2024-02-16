package it.merigreis.mylibrary.service;

import it.merigreis.mylibrary.Dto.BookReviewDTO;
import it.merigreis.mylibrary.model.BookReview;
import it.merigreis.mylibrary.repository.BookReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookReviewService {
    private BookReviewRepository bookReviewRepository;
    private BookService bookService;

    public BookReviewService(BookReviewRepository bookReviewRepository, BookService bookService) {
        this.bookReviewRepository = bookReviewRepository;
        this.bookService = bookService;
    }

    public void addReview(BookReviewDTO newReview) {
        BookReview bookReview = new BookReview();
        bookReview.setTitle(newReview.getTitle());
        bookReview.setMyReview(newReview.getMyReview());
        bookReview.setDate(newReview.getDate());
        bookReview.setFkBook(bookService.showBookById(newReview.getBookId()));
        bookReviewRepository.save(bookReview);
    }
    public BookReview showReviewbyId(String title){
        Optional<BookReview> bookReview = bookReviewRepository.findById(title);
        if(bookReview.isEmpty()) return null;
        else return bookReview.get();
    }
    public void removeReviewById(String title){
        bookReviewRepository.deleteById(title);
    }
    public List<BookReview> showAllReview(){
        List<BookReview> bookReviewList = bookReviewRepository.findAll();
        if(bookReviewList.isEmpty()) return null;
        else return bookReviewList;
     }
}

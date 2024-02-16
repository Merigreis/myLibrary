package it.merigreis.mylibrary.controller;

import it.merigreis.mylibrary.Dto.BookReviewDTO;
import it.merigreis.mylibrary.model.BookReview;
import it.merigreis.mylibrary.service.BookReviewService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookReviewController {
    private BookReviewService bookReviewService;

    public BookReviewController(BookReviewService bookReviewService){
        this.bookReviewService = bookReviewService;
    }

    @PostMapping("/addReview")
    public ResponseEntity<Void> addNewReview(@RequestBody BookReviewDTO newReview){

        bookReviewService.addReview(newReview);
        return ResponseEntity.ok().build();

    }
    @GetMapping("/showReviewBy/{id}")
    public ResponseEntity<BookReview> getReviewById(@PathVariable String id){
        return ResponseEntity.ok(bookReviewService.showReviewbyId(id));
    }
    @DeleteMapping("/deleteBy/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id){
        if (id == null) return ResponseEntity.badRequest().build();
        bookReviewService.removeReviewById(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/getAllReviews")
    public ResponseEntity<List<BookReview>> getAllReview(){
        List<BookReview> bookReviewList = bookReviewService.showAllReview();
        if(bookReviewList == null) return ResponseEntity.noContent().build();
        return ResponseEntity.ok(bookReviewList);
    }


}

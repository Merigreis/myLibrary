package it.merigreis.mylibrary.Dto;

import java.time.LocalDate;

public class BookReviewDTO {
    private String title;
    private String myReview;
    private LocalDate date;
    private Long bookId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMyReview() {
        return myReview;
    }

    public void setMyReview(String myReview) {
        this.myReview = myReview;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}

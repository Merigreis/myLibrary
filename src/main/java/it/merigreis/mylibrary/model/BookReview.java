package it.merigreis.mylibrary.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "book-review")
@Entity
public class BookReview {
    @Id
    @Column(name = "id-review")
    private String title;

    @Column(name = "review")
    private String myReview;

    @Column(name = "date")
    private LocalDate date;

    @OneToOne
    @JoinColumn(name = "book", referencedColumnName = "id-book")
    private Book fkBook;

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
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
}

package it.merigreis.mylibrary.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id-book")
    private Long ISBN;

    @Column(name = "book-title")
    private String title;

    @Column(name = "book-plot")
    private String plot;

    @Column(name = "publish-date")
    private LocalDate dateOfPublish;

    public Long getISBN(){
        return this.ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setISBN(Long ISBN){
        this.ISBN = ISBN;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public LocalDate getDateOfPublish() {
        return dateOfPublish;
    }

    public void setDateOfPublish(LocalDate dateOfPublish) {
        this.dateOfPublish = dateOfPublish;
    }
}

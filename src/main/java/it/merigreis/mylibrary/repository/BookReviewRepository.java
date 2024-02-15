package it.merigreis.mylibrary.repository;

import it.merigreis.mylibrary.model.BookReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReviewRepository extends JpaRepository<BookReview, String> {
}

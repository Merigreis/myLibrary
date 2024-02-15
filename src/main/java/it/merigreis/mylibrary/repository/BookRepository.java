package it.merigreis.mylibrary.repository;

import it.merigreis.mylibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long > {
}

package com.luv.code.springbootlibrary.DAO;

import com.luv.code.springbootlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}

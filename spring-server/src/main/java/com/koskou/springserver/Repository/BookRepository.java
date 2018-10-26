package com.koskou.springserver.Repository;

import com.koskou.springserver.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("http://localhost:3000")
public interface BookRepository extends JpaRepository<Book, Long> {
}

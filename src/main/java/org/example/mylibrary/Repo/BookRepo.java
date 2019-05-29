package org.example.mylibrary.Repo;

import org.example.mylibrary.Model.Category;
import org.example.mylibrary.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
    public Book findByTag(String tag);
    public List<Book> findByCategory(Category category);
    public List<Book> findByCategoryAndStatus(Category category, Integer status);
    public Long countByStatus(Integer status);

}

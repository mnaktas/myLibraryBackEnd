package org.harmonytx.mylibrary.Repo;

import org.harmonytx.mylibrary.Model.Book;
import org.harmonytx.mylibrary.Model.Category;
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

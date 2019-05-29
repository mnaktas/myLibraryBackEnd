package org.example.mylibrary.Repo;

import org.example.mylibrary.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
    public List<Category> findAllByOrderByNameAsc();
}

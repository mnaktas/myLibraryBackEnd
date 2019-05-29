package org.example.mylibrary.Repo;

import org.example.mylibrary.Model.Borrowed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowedRepo extends JpaRepository<Borrowed, Long> {

}

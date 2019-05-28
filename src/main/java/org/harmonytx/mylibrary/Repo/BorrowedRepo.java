package org.harmonytx.mylibrary.Repo;

import org.harmonytx.mylibrary.Model.Borrowed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowedRepo extends JpaRepository<Borrowed, Long> {

}

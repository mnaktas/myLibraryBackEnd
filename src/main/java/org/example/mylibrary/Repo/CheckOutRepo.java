package org.example.mylibrary.Repo;

import org.example.mylibrary.Model.CheckOut;
import org.example.mylibrary.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckOutRepo extends JpaRepository<CheckOut, Long> {
    public List<CheckOut> findByReturned(Integer returned);
    public Long countByUser(User user);
}

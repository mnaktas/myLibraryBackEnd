package org.harmonytx.mylibrary.Repo;

import org.harmonytx.mylibrary.Model.CheckOut;
import org.harmonytx.mylibrary.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckOutRepo extends JpaRepository<CheckOut, Long> {
    public List<CheckOut> findByReturned(Integer returned);
    public Long countByUser(User user);
}

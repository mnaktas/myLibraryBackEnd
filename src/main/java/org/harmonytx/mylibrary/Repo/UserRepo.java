package org.harmonytx.mylibrary.Repo;

import org.harmonytx.mylibrary.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    public List<User> findAllByOrderByFirstnameAscLastnameAsc();
    public Long countByType(String type);
    public List<User> findAllByOrderByGradeAsc();
    public List<User> findAllByTypeEquals(String type);
}

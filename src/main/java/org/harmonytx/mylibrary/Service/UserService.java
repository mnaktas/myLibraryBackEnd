package org.harmonytx.mylibrary.Service;

import org.harmonytx.mylibrary.Constants.Constants;
import org.harmonytx.mylibrary.Model.CheckOut;
import org.harmonytx.mylibrary.Model.User;
import org.harmonytx.mylibrary.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jca.cci.CciOperationNotSupportedException;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private CheckOutService checkOutService;

    public Long getTotalUsersCount(){
        return userRepo.count();
    }
    public Long getTotalStudentsCount(){
        return userRepo.countByType(Constants.STUDENT);
    }

    public Long getTotalTeachersCount(){
        return userRepo.countByType(Constants.TEACHER);
    }
    public Long getTotalAdminsCount(){
        return userRepo.countByType(Constants.ADMIN);
    }

    public List<User> getAllUsers(){
        return userRepo.findAllByOrderByFirstnameAscLastnameAsc();
    }

    public User getUserById(Long id){
        return userRepo.findById(id).get();
    }
    public User addNewUser(User user){
        user.setJoinedDate(new Date());
        return userRepo.save(user);
    }

    public User save(User user){
        return userRepo.save(user);
    }
    public void delete(User user){
        userRepo.delete(user);
    }
    public void delete(Long id){
        userRepo.deleteById(id);
    }
    public boolean hasUsage(User user){
        return checkOutService.getCountByUser(user) > 0;
    }

}

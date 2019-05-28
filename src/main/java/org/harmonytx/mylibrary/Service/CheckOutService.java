package org.harmonytx.mylibrary.Service;

import org.harmonytx.mylibrary.Constants.Constants;
import org.harmonytx.mylibrary.Model.CheckOut;
import org.harmonytx.mylibrary.Model.User;
import org.harmonytx.mylibrary.Repo.CheckOutRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CheckOutService {

    @Autowired
    private CheckOutRepo checkOutRepo;

    public List<CheckOut> getAllCheckOuts(){
        return checkOutRepo.findAll();
    }
    public CheckOut getCheckoutById(Long id){
        return checkOutRepo.findById(id).get();
    }
    public List<CheckOut> getAllNotReturned(){
        return checkOutRepo.findByReturned(Constants.NOT_RETURNED);
    }

    public CheckOut addNewCheckout(CheckOut checkOut){
        checkOut.setCheckOutDate(new Date());
        checkOut.setReturned(Constants.NOT_RETURNED);
        return checkOutRepo.save(checkOut);
    }

    public CheckOut save(CheckOut checkOut){
        return checkOutRepo.save(checkOut);
    }

    public Long getCountByUser(User user){
        return checkOutRepo.countByUser(user);
    }

}

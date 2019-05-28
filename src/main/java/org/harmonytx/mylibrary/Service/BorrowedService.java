package org.harmonytx.mylibrary.Service;

import org.harmonytx.mylibrary.Constants.Constants;
import org.harmonytx.mylibrary.Model.Borrowed;
import org.harmonytx.mylibrary.Repo.BorrowedRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BorrowedService {
    @Autowired
    private BorrowedRepo borrowedRepo;

    public List<Borrowed> getAllBorrowed(){
        return borrowedRepo.findAll();
    }

    public Borrowed getBorrowedById(Long id){
        return borrowedRepo.findById(id).get();
    }

    public Borrowed save(Borrowed borrowed){
        return borrowedRepo.save(borrowed);
    }

    public Borrowed addNewBorrowed(Borrowed borrowed){
        borrowed.setReturned(Constants.NOT_RETURNED);
        return borrowedRepo.save(borrowed);
    }
}

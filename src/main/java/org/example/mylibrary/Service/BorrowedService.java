package org.example.mylibrary.Service;

import org.example.mylibrary.Constants.Constants;
import org.example.mylibrary.Model.Borrowed;
import org.example.mylibrary.Repo.BorrowedRepo;
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

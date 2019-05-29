package org.example.mylibrary.Service;

import org.example.mylibrary.Model.Book;
import org.example.mylibrary.Model.Category;
import org.example.mylibrary.Repo.BookRepo;
import org.example.mylibrary.Constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public Long getTotalCheckedOutBooks(){
        return bookRepo.countByStatus(Constants.STATUS_BORROWED);
    }

    public Long getTotalBooksCount(){
        return bookRepo.count();
    }

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    public Book getBookById(Long id){
        return bookRepo.findById(id).get();
    }

    public Book getBookByTag(String tag){
        return bookRepo.findByTag(tag);
    }

    public List<Book> get(List<Long> ids){
        return bookRepo.findAllById(ids);
    }
    public List<Book> getBookByCategory(Category category){
        return bookRepo.findByCategory(category);
    }
    public List<Book> getBookByCategoryAndStatus(Category category){
        return bookRepo.findByCategoryAndStatus(category,Constants.STATUS_AVAILABLE);
    }
    public Book addNewBook(Book book,Category category){
        book.setCreateDate(new Date());
        book.setStatus(Constants.STATUS_AVAILABLE);
        book.setCategory(category);
        return bookRepo.save(book);
    }
    public Book save(Book book){
        return bookRepo.save(book);
    }

    public void delete(Book book){
        bookRepo.delete(book);
    }

    public void delete(Long id){
        bookRepo.deleteById(id);
    }

}

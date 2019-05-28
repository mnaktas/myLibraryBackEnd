package org.harmonytx.mylibrary.Controller;

import org.harmonytx.mylibrary.Model.Book;
import org.harmonytx.mylibrary.Model.Category;
import org.harmonytx.mylibrary.Service.BookService;
import org.harmonytx.mylibrary.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;
import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping(value = "/{id}/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book addNewBook(@PathVariable("id") Long id, @Valid @RequestBody Book book){
        Category cat = categoryService.getCategoryById(id);
        return bookService.addNewBook(book,cat);
    }

}

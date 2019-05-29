package org.example.mylibrary.Controller;

import org.example.mylibrary.Model.Book;
import org.example.mylibrary.Model.Category;
import org.example.mylibrary.Service.BookService;
import org.example.mylibrary.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

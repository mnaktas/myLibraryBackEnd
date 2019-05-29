package org.example.mylibrary.Controller;

import org.example.mylibrary.Model.Category;
import org.example.mylibrary.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/categories")
    public void addNewCategory(@Valid @RequestBody Category category){
        categoryService.addCategory(category);
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}

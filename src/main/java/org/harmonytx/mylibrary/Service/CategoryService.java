package org.harmonytx.mylibrary.Service;

import org.harmonytx.mylibrary.Constants.Constants;
import org.harmonytx.mylibrary.Model.Book;
import org.harmonytx.mylibrary.Model.Category;
import org.harmonytx.mylibrary.Repo.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;


    public Long getTotalCategoriesCount(){
        return categoryRepo.count();
    }

    public List<Category> getAllCategoriesBySort(){
        return categoryRepo.findAllByOrderByNameAsc();
    }

    public List<Category> getAllCategories(){
        return categoryRepo.findAll();
    }

    public Category getCategoryById(Long id){
        return categoryRepo.findById(id).get();
    }

    public Category addCategory(Category category){
        category.setCreateDate(new Date());
        return categoryRepo.save(category);
    }

    public Category save(Category category){
        return categoryRepo.save(category);
    }

    public void delete(Category category){
        categoryRepo.delete(category);
    }

    public void delete(Long id){
        categoryRepo.deleteById(id);
    }

}

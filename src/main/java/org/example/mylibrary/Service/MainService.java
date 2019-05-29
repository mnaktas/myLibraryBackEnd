package org.example.mylibrary.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class MainService {
    @Autowired
    private UserService userService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private BookService bookService;

    public Map<String, Long> getMainStats(){
        Map<String, Long> map = new HashMap<String, Long>();
        map.put("TotalUsers", userService.getTotalUsersCount());
        map.put("TotalStudents", userService.getTotalStudentsCount());
        map.put("TotalTeachers", userService.getTotalTeachersCount());
        map.put("TotalAdmins",userService.getTotalAdminsCount());
        map.put("TotalCategories",categoryService.getTotalCategoriesCount());
        map.put("TotalBooks", bookService.getTotalBooksCount());
        map.put("TotalBorrowedBooks", bookService.getTotalCheckedOutBooks());
        map.put("TotalAvailableBooks",bookService.getTotalBooksCount()-bookService.getTotalCheckedOutBooks());
        return map;
    }

    public Long noOfCategories(){
        return categoryService.getTotalCategoriesCount();
    }

}

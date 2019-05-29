package org.harmonytx.mylibrary.Controller;

import org.harmonytx.mylibrary.Model.User;
import org.harmonytx.mylibrary.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE)
    public User addUser( @RequestBody User user){
       return userService.addNewUser(user);
    }

    @GetMapping("/users/{type}")
    public List<User> getUserByType(@PathVariable("type") String type){
        return userService.getUserByType(type);
    }
}

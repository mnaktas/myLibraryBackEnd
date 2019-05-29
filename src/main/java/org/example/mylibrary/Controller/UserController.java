package org.example.mylibrary.Controller;

import org.example.mylibrary.Model.User;
import org.example.mylibrary.Service.UserService;
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
    public User addUser(@Valid @RequestBody User user){
       return userService.addNewUser(user);
    }

    @GetMapping("/users/{type}")
    public List<User> getUserByType(@PathVariable("type") String type){
        return userService.getUserByType(type);
    }
    @GetMapping("/users/byid/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/users/{id}")
    public User updateUser( @PathVariable("id") Long id, @Valid @RequestBody User user){
        return userService.updateUser(user, id);
    }
}

package signupform.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import signupform.demo.entity.User;
import signupform.demo.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin()
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public void saveUser(@RequestBody User user){
        service.saveUser(user);
    }
}

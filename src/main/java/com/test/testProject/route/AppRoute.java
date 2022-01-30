package com.test.testProject.route;

import com.test.testProject.entities.User;
import com.test.testProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/")
public class AppRoute {

    @GetMapping("/returnHello")
    public String returnHello() {
        return "Hello Avinash----Me!";
    }

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers() {
        return this.userRepository.findAll();
    }

    @PostMapping ("users")
    public List<User> postUsers(@RequestBody User user) {
        this.userRepository.save(new User(user.getFirstName(), user.getLastName(), user.getEmail()));
        return this.userRepository.findAll();
    }
}

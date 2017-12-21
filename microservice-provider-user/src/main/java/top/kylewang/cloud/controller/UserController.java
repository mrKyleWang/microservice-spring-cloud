package top.kylewang.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.kylewang.cloud.entity.User;
import top.kylewang.cloud.repository.UserRepository;

/**
 * @author Kyle.Wang
 * 2017/12/18 0018 15:46
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return user;
    }
}

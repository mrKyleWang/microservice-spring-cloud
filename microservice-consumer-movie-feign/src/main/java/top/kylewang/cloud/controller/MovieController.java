package top.kylewang.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import top.kylewang.cloud.UserFeignClient;
import top.kylewang.cloud.entity.User;

/**
 * @author Kyle.Wang
 * 2017/12/18 0018 15:58
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable("id") Long id){
        return userFeignClient.findById(id);
    }


    @PostMapping("/test")
    public User testPost(User user){
        return userFeignClient.postUser(user);
    }

}

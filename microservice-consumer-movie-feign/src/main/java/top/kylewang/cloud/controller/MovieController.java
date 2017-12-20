package top.kylewang.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import top.kylewang.cloud.entity.User;

/**
 * @author Kyle.Wang
 * 2017/12/18 0018 15:58
 */
@RestController
public class MovieController {

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return null;
    }

}

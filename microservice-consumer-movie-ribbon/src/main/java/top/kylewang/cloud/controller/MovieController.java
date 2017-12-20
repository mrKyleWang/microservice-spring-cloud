package top.kylewang.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import top.kylewang.cloud.entity.User;

/**
 * @author Kyle.Wang
 * 2017/12/18 0018 15:58
 */
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServicePath}")
    private String userServicePath;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        //TODO 更改此处硬编码访问微服务方式
        return this.restTemplate.getForObject(userServicePath+id,User.class);
    }

}

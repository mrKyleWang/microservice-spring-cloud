package top.kylewang.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.kylewang.cloud.entity.User;

/**
 * @author Kyle.Wang
 * 2017/12/20 0020 22:04
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    //两个坑:1.不支持@GetMapping, 2.@PathVariable必须指定参数名
    @RequestMapping(value = "/simple/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);


    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User postUser(@RequestBody User user);



}

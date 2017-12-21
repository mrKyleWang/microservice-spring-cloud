package top.kylewang.cloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import top.kylewang.cloud.entity.User;

/**
 * @author Kyle.Wang
 * 2017/12/20 0020 22:04
 */
@FeignClient(name = "microservice-provider-user",fallback = HystrixClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);


}



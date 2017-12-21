package top.kylewang.cloud.feign;

import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import top.kylewang.cloud.entity.User;
import top.kylewang.config.FeignConfiguration;

/**
 * @author Kyle.Wang
 * 2017/12/20 0020 22:04
 */
@FeignClient(name = "microservice-provider-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {

    //由于使用了默认feign契约,则必须使用feign注解,不能使用SpringMVC注解
    @RequestLine("GET /simple/{id}")
    public User findById(@Param("id") Long id);



}

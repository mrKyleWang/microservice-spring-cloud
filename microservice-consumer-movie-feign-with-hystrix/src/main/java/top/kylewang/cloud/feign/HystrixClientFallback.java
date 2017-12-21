package top.kylewang.cloud.feign;

import org.springframework.stereotype.Component;
import top.kylewang.cloud.entity.User;

@Component
class HystrixClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }
}
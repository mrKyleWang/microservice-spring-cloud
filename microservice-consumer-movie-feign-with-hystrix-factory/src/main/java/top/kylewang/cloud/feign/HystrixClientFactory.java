package top.kylewang.cloud.feign;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import top.kylewang.cloud.entity.User;

/**
 * @author Kyle.Wang
 * 2017/12/21 0021 20:54
 */
@Component
public class HystrixClientFactory implements FallbackFactory<UserFeignClient>{

    private static final Logger logger = LoggerFactory.getLogger(HystrixClientFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        logger.error("fallback; reason was: {}",throwable.getMessage());

        return new UserFeignClientWithFactory(){
            @Override
            public User findById(Long id) {
                User user = new User();
                user.setId(-1L);
                return user;
            }
        };
    }
}

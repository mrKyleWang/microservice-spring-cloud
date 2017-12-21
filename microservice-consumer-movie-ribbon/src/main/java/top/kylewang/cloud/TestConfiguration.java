package top.kylewang.cloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kyle.Wang
 * 2017/12/19 0019 14:46
 */
@Configuration
public class TestConfiguration {

//    @Autowired
//    IClientConfig config;

    @Bean
    public IRule ribbonRule() {
        //返回随机策略
        return new RandomRule();
    }
}

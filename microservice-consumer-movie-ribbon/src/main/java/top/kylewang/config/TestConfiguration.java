package top.kylewang.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kyle.Wang
 * 2017/12/19 0019 14:46
 */
@Configuration
public class TestConfiguration {

    @Autowired
    IClientConfig config;

    @Bean
    public IRule ribbonRule(IClientConfig config) {
        //返回随机策略
        return new RandomRule();
    }
}

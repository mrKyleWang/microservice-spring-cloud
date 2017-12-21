package top.kylewang.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kyle.Wang
 * 2017/12/21 0021 11:05
 */
@Configuration
public class FeignConfiguration {

    /**
     * 配置契约
     * @return
     */
    @Bean
    public Contract feignContract(){
        //使用feign默认契约
        return new feign.Contract.Default();
    }

    /**
     * 配置日志
     * @return
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}

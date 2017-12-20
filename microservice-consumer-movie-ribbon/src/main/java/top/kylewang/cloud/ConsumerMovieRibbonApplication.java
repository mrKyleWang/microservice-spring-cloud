package top.kylewang.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import top.kylewang.config.TestConfiguration;

@SpringBootApplication
@EnableEurekaClient
//配置ribbon负载均衡请求策略,在TestConfiguration中配置
@RibbonClient(name = "microservice-provider-user",configuration = TestConfiguration.class )
public class ConsumerMovieRibbonApplication {

	@Bean
	@LoadBalanced	//整合了ribbon,添加负载均衡能力
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieRibbonApplication.class, args);
	}
}

package top.kylewang.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kyle.Wang
 * 2017/12/23 0023 21:55
 */
@RestController
public class ConfigClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile(){
        return profile;
    }
}

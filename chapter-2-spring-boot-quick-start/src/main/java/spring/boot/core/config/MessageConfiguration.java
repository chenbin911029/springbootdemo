package spring.boot.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenbin at 2018/3/16 15:06
 */
@Configuration
public class MessageConfiguration {
    @Bean
    public String message() {
        return "message configuration";
    }
}

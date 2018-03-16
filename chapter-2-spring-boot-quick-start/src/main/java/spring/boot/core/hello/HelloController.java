package spring.boot.core.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenbin at 2018/3/16 9:25
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello,this is a springboot demo";
    }
}


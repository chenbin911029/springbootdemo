package spring.boot.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import spring.boot.core.dubbo.CityDubboConsumerService;

@SpringBootApplication
public class SpringbootDubboClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication
				.run(SpringbootDubboClientApplication.class, args);
		CityDubboConsumerService service = run.getBean(CityDubboConsumerService.class);
		service.printCity();
	}
}

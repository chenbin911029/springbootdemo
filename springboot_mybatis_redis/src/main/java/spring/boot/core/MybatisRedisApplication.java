package spring.boot.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// mapper 接口类扫描包配置
@MapperScan("spring.boot.core.dao")
public class MybatisRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisRedisApplication.class, args);
	}
}

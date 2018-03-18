package spring.boot.core.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import spring.boot.core.domain.City;

/**
 * Created by chenbin on 2018\3\18 0018.
 */
@Component
public class CityDubboConsumerService {
    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public void printCity() {
        Long id=2L;
        City city = cityDubboService.findById(id);
        System.out.println(city.toString());
    }
}

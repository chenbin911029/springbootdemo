package spring.boot.core.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import spring.boot.core.dao.CityDao;
import spring.boot.core.domain.City;
import spring.boot.core.dubbo.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    @Autowired
    CityDao cityDao;
    public City findById(Long id) {
        return cityDao.findById(id);
    }
}

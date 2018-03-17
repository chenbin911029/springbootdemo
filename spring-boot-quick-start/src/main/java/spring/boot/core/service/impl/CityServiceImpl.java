package spring.boot.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.boot.core.dao.cluster.CityDao;
import spring.boot.core.dao.master.UserDao;
import spring.boot.core.domain.City;
import spring.boot.core.domain.User2;
import spring.boot.core.service.CityService;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private CityDao cityDao; // 从数据源
//    @Autowired
//    private CityDao2 cityDao2;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
        //return cityDao2.findById(cityName);
    }

    public List<City> findAllCity(){
        return cityDao.findAllCity();
    }

    public City findCityById(Long id) {
        return cityDao.findById(id);
    }

    public User2 findById(Long id) {
        User2 user = userDao.findById(id);
        City city = cityDao.findByName("深圳");
        user.setCity(city);
        return user;
    }

}

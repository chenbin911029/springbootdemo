package spring.boot.core.service;


import spring.boot.core.domain.City;
import spring.boot.core.domain.User2;

import java.util.List;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);

    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    User2 findById(Long id);

    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    City findCityById(Long id);
}

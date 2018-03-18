package spring.boot.core.dubbo;

import spring.boot.core.domain.City;

/**
 * 城市业务 Dubbo 服务层
 *
 * Created by bysocket on 28/02/2017.
 */
public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     * @param id
     */
    City findById(Long id);
}

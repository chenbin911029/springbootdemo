package spring.boot.core.exception.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;
import spring.boot.core.exception.constant.CityErrorInfoEnum;
import spring.boot.core.exception.result.GlobalErrorInfoException;
import spring.boot.core.exception.result.ResultBody;

/**
 * 错误码案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class ErrorJsonController {


    /**
     * 获取城市接口
     *
     * @param cityName
     * @return
     * @throws GlobalErrorInfoException
     */
    @RequestMapping(value = "/exception/city")
    public ResultBody findOneCity(@RequestParam("cityName") String cityName) throws GlobalErrorInfoException {
        // 入参为空
        if (StringUtils.isEmptyOrWhitespace(cityName)) {
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        return new ResultBody(new City(1L,2L,"温岭","是我的故乡"));
    }
}
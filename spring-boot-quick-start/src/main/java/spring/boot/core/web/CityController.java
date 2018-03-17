package spring.boot.core.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.boot.core.domain.City;
import spring.boot.core.domain.User2;
import spring.boot.core.service.CityService;

/**
 * Created by bysocket on 07/02/2017.
 */
@RequestMapping(value = "/api")
@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/city", method = RequestMethod.GET)
    @ResponseBody
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "/cityAndUser", method = RequestMethod.GET)
    @ResponseBody
    public User2 findById(@RequestParam(value = "id", required = true) Long id) {
        return cityService.findById(id);
    }



    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String createUserForm(ModelMap map) {
        return "test";
    }
}

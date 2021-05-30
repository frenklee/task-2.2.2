package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
@RequestMapping(value="/cars")
public class CarsController {

    @Autowired
    private CarServiceImp carService;

    @GetMapping()
    public String Cars(@RequestParam(value = "count",required = false) Integer count, Model model){
        List<Car> finalList;
        if(count<=0 || count>=5){
            finalList = carService.listCars(5);
        }
        else {
            finalList = carService.listCars(count);
        }
        model.addAttribute("list",finalList);
        return "cars";
    }

}

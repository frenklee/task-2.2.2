package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarServiceImp carService;

    @GetMapping(value = "/")
    public String Cars(@RequestParam(value = "count",required = false) int count, Model model){
        List<Car> finalList;
        if (count == 0) {
            finalList = carService.listCars(5);
        } else if(count < 5){
            finalList = carService.listCars(count);
        } else {
            finalList = carService.listCars(5);
        }
        model.addAttribute("list",finalList);
        return "cars";
    }

}

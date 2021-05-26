package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {


	@GetMapping(value="/cars")
	public String Cars(@RequestParam(value = "count",required = false) int count, ModelMap model){
		CarService carService = new CarServiceImp();
		List<Car> listOfCars = new ArrayList<>();
		List<Car> finalList = null;
		listOfCars.add(new Car(1,"Camry",1200));
		listOfCars.add(new Car(2,"Landcruiser",2500));
		listOfCars.add(new Car(3,"Camaro",1400));
		listOfCars.add(new Car(4,"Juke",1000));
		listOfCars.add(new Car(5,"Rav4",1100));
		if (count == 0) {
			finalList = carService.listCars(listOfCars,5);
		} else if(count < 5){
			finalList = carService.listCars(listOfCars,count);
 		} else {
			finalList = carService.listCars(listOfCars,5);
		}
		model.addAttribute("list",finalList);
		return "cars";
	}
	
}
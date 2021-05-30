package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class CarServiceImp implements CarService{

    @Override
    public List<Car> listCars(int count){
        List<Car> list = new ArrayList<>();
        List<Car> finalList = new ArrayList<>();
        list.add(new Car(1,"Camry",1200));
        list.add(new Car(2,"Landcruiser",2500));
        list.add(new Car(3,"Camaro",1400));
        list.add(new Car(4,"Juke",1000));
        list.add(new Car(5,"Rav4",1100));
        Iterator<Car> iter = list.iterator();
        while(iter.hasNext()){
            if(count==0){
                break;
            }
            Car element = iter.next();
            finalList.add(element);
            count--;
        }
        return finalList;
    }

}

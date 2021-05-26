package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CarServiceImp implements CarService{

    @Override
    public List<Car> listCars(List<Car> listOfCars, int count){
        List<Car> finalList = new ArrayList<>();
        Iterator<Car> iter = listOfCars.iterator();
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

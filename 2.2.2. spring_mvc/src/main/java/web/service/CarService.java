package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    public List<Car> listCars(List<Car> listOfCars, int count);
}
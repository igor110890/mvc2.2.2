package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "X5", 1234));
        cars.add(new Car("Mazda", "CX-7", 5678));
        cars.add(new Car("Lada", "Vesta", 9182));
        cars.add(new Car("Renault", "Duster", 4578));
        cars.add(new Car("Honda", "Civic", 8833));
    }

    @Override
    public List<Car> getCarsByCount(Integer count){
        return (count == null) ? cars : cars.stream().limit(count).collect(Collectors.toList());
    }
}
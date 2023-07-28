package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {
    List<Car> cars = new ArrayList<>();

    public CarDaoImp() {
        cars.add(new Car(1, "Nissan", 220,"Black"));
        cars.add(new Car(2, "Mercedes", 250, "Blue"));
        cars.add(new Car(3, "BMW", 230, "Orange"));
        cars.add(new Car(4, "Audi", 180,"Green"));
        cars.add(new Car(5, "Porsche", 300, "Red"));
    }
    @Override
    public List<Car> getCarList(int count) {
        if(count < 1 || count > cars.size()) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}

package web.dao;

import web.Model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarList(int count);
}

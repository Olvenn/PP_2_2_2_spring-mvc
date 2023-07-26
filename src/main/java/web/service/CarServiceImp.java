package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Model.Car;
import web.dao.CarDao;

import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private CarDao carDao;

    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}

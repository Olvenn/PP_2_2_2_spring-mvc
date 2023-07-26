package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {

        this.carServiceImp = carServiceImp;
    }

    @GetMapping(value = "/cars")
    public String getCarsList(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model) {

        List<String> cars = new ArrayList<>();
        for (Car car : carServiceImp.getCarList(count)) {
            cars.add(car.toString());
        }
        model.addAttribute("cars", carServiceImp.getCarList(count));
        return "cars";
    }

}

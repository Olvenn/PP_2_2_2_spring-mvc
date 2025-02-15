package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
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

        model.addAttribute("cars", carServiceImp.getCarList(count));
        return "cars";
    }

}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;


@Controller
public class CarController {

    @Autowired
    private CarServiceImp carServiceImp;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model){
        model.addAttribute("cars", carServiceImp.getCarsByCount(count));
        return "car/cars";
    }
}
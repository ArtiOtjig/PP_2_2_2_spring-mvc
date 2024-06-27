package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String showCars (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Skoda Rapid", "Yellow", 24342345));
        cars.add(new Car("BMW X5", "Black", 6894948));
        cars.add(new Car("Kia Sportage", "White", 112223241));
        cars.add(new Car("Lada Granta", "Green", 120039993));
        cars.add(new Car("Mitsubishi Galant", "Red", 123199033));
        model.addAttribute("cars", CarService.carsCount(cars, count));
        return "/cars";
    }


}

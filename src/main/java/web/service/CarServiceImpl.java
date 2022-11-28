package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> readCar(int a) {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < a; i++){
            newListCar.add(ListCar.get(i));
        }
        return newListCar;
    }
    private List<Car> ListCar;
    {
        ListCar = new ArrayList<>();
        ListCar.add(new Car("Infiniti QX60", 262, "Бензин"));
        ListCar.add(new Car("Toyota Land Cruiser 200", 235, "Дизель"));
        ListCar.add(new Car("Mercedes-Benz GLC Coupe", 245, "Бензин"));
        ListCar.add(new Car("Volvo XC90", 235, "Дизель"));
        ListCar.add(new Car("Lexus RX", 238, "Бензин"));
    }
}
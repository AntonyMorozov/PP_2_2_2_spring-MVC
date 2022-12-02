package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.List;

@Service
public class ServiceCarImpl extends CarService {


    @Override
    public List<Car> getListOfCar(int count) {
        return resultList.stream().limit(count).toList();
    }
}

package oose.rowanpaulflynn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarFilter {

    public Car[] filterByFuel(ArrayList<Car> cars, final String fuel) {
        List<Car> carsStream = cars.stream()
                .filter(car -> car.getFuelType().equals(fuel))
                .collect(Collectors.toList());

        return carsStream.toArray(Car[]::new);
    }

    public long numberOfBrands(ArrayList<Car> cars, String brand) {
        ArrayList<Car> brandCars = new ArrayList<Car>();

        List<Car> carsStream = cars.stream()
                .map(car -> {
                    if(car.getBrandName().equals(brand)) {
                        brandCars.add(car);
                    }
                    return car;
                })
                .collect(Collectors.toList());

        return brandCars.size();
    }

    public int totalPassengers(ArrayList<Car> cars) {
        int sum = cars.stream()
                .map(car -> {
                    return car.getPassengers();
                })
                .reduce(0,
                        Integer::sum);
        return sum;
    }
}

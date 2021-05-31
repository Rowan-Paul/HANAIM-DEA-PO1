package oose.rowanpaulflynn;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CarFilterTest {

    private ArrayList<Car> cars;
    private CarFilter carFilter;

    @BeforeEach
    public void setup(){
        this.cars = new ArrayList<>();
        cars.add(new Car("Fiat", "Multipla",5,"diesel"));
        cars.add(new Car("Fiat", "Punto",4,"euro95"));
        cars.add(new Car("Tesla", "Model 3",5,"electricity"));
        cars.add(new Car("Tesla", "Roadster",2,"electricity"));
        cars.add(new Car("Nissan", "Leaf",5,"electricity"));
        cars.add(new Car("Nissan", "CashCow",4,"euro95"));
        cars.add(new Car("Nissan", "Micra",4,"euro95"));
        cars.add(new Car("Porsche", "911",4,"euro98"));
        cars.add(new Car("Opel", "Kadet",4,"euro95"));

        carFilter = new CarFilter();
    }

    @Test
    public void filterByFuelTest(){
        String fuel = "electricity";
        Car[] expectedCars = {
                new Car("Tesla", "Model 3", 5, "electricity"),
                new Car("Tesla", "Roadster", 2, "electricity"),
                new Car("Nissan", "Leaf", 5, "electricity")
        };

        Car[] filteredCars = carFilter.filterByFuel(cars, fuel);
        assertArrayEquals(expectedCars,filteredCars);
    }

    @Test
    public void numberOfBrandsTest(){
        String brand = "Nissan";
        int expected = 3;

        assertEquals(expected,carFilter.numberOfBrands(cars, brand));

    }

    @Test
    public void totalPassengersTest(){
        int expectedPassengers = 37;

        assertEquals(expectedPassengers,carFilter.totalPassengers(cars));
    }

}

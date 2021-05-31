package oose.rowanpaulflynn;

public class Car {
    private String brandName;
    private String model;
    private int passengers;
    private String fuelType;

    public Car(String brandName, String model, int passengers, String fuelType) {
        this.brandName = brandName;
        this.model = model;
        this.passengers = passengers;
        this.fuelType = fuelType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

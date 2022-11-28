package web.model;

public class Car {
    private String brand;
    private int enginePower;
    private String fuelType;

    public Car(String brand, int enginePower, String fuelType) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", enginePower=" + enginePower +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }
}
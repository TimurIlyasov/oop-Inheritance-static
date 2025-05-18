package src.transports;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;
    protected double fuelPercentage; // поле для наследников

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        this.brand = checkString(brand);
        this.model = checkString(model);
        this.year = year;
        this.country = checkString(country);
        setColor(color);
        setMaxSpeed(maxSpeed);
        setFuelPercentage(fuelPercentage);
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }

    protected void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage < 0 || fuelPercentage > 100) {
            this.fuelPercentage = 100.0;
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    public void setColor(String color) {
        this.color = checkString(color);
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = Math.max(maxSpeed, 0);
    }

    protected static String checkString(String value) {
        return (value == null || value.isBlank()) ? "default" : value;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " г., " + country + ", цвет: " + color + ", макс. скорость: " + maxSpeed + " км/ч, топливо: " + fuelPercentage + "%";
    }

    public abstract void refill();
}

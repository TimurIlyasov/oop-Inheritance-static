package src.transports;

public class Car extends Transport {
    private double engineVolume;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage);
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем или заряжать на электропарковке.");
        setFuelPercentage(100.0);
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(", объем двигателя %.1f л, топлива: %.2f%%", engineVolume, getFuelPercentage());
    }
}

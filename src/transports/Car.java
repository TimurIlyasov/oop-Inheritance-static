package Transports;

/**
 * Класс Car — наследник Transport, может содержать доп. параметры для машины.
 */
public class Car extends Transport {
    private double engineVolume;

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = (engineVolume <= 0) ? 1.5 : engineVolume;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", объем двигателя %.1f л", engineVolume);
    }
}

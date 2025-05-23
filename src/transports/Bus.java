package Transports;

/**
 * Класс Bus представляет автобус, расширяет Transport.
 */
public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString();
    }
}

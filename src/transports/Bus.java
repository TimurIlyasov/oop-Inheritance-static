package src.transports;

/**
 * Класс Bus представляет автобус, расширяет Transport.
 */
public class Bus extends Transport {

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage); // добавлен fuelPercentage
    }

    @Override
    public void refill() {
        System.out.println("Автобус можно заправить бензином или дизелем на заправке.");
        setFuelPercentage(100.0);
    }

    @Override
    public String toString() {
        return "Автобус: " + super.toString() + String.format(", топлива: %.2f%%", getFuelPercentage());
    }
}

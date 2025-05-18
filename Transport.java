/**
 * Класс Transport представляет базовый транспорт с общими характеристиками.
 */
public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    /**
     * Конструктор для класса Transport
     */
    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = (color == null || color.isBlank()) ? "белый" : color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = (maxSpeed <= 0) ? 100 : maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d года, страна %s, цвет %s, макс. скорость %d км/ч",
                brand, model, year, country, color, maxSpeed);
    }
}

package src.transports;

/**
 * Класс Train представляет поезд, расширяет Transport и добавляет специфические параметры.
 */
public class Train extends Transport {
    private double price;
    private double travelTime;
    private String departureStation;
    private String arrivalStation;
    private int carriageCount;

    public Train(String brand, String model, int year, String country, String color, int maxSpeed,
                 double price, double travelTime, String departureStation, String arrivalStation,
                 int carriageCount, double fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed, fuelPercentage); // добавлен fuelPercentage
        setPrice(price);
        setTravelTime(travelTime);
        setDepartureStation(departureStation);
        setArrivalStation(arrivalStation);
        setCarriageCount(carriageCount);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price <= 0) ? 1000 : price;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = (travelTime <= 0) ? 1.0 : travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = (departureStation == null || departureStation.isBlank())
                ? "Станция отправления не указана" : departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = (arrivalStation == null || arrivalStation.isBlank())
                ? "Станция прибытия не указана" : arrivalStation;
    }

    public int getCarriageCount() {
        return carriageCount;
    }

    public void setCarriageCount(int carriageCount) {
        this.carriageCount = (carriageCount <= 0) ? 1 : carriageCount;
    }

    @Override
    public void refill() {
        System.out.println("Поезд заправляется дизелем.");
        setFuelPercentage(100.0);
    }

    @Override
    public String toString() {
        return String.format("%s, цена: %.0f руб., время поездки: %.1f ч, от: %s, до: %s, вагонов: %d, топлива: %.2f%%",
                super.toString(), price, travelTime, departureStation, arrivalStation, carriageCount, getFuelPercentage());
    }
}

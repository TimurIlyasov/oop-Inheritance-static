package src;

import src.transports.Car;
import src.transports.Train;
import src.transports.Bus;

public class Main {
    public static void main(String[] args) {
        // Автомобили
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 180, 1.7, 57.49);
        Car audi = new Car("Audi", "A8", 2020, "Германия", "черный", 250, 3.0, 10.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", null, -100, -2.0, 0.0);

        // Поезда
        Train lastochka = new Train(
                "Ласточка", "B-901", 2011, "Россия", "красный", 301,
                3500, 4.5, "Белорусский вокзал", "Минск-Пассажирский", 11, 42.0
        );
        Train leningrad = new Train(
                "Ленинград", "D-125", 2019, "Россия", "синий", 270,
                1700, 3.2, "Ленинградский вокзал", "Ленинград-Пассажирский", 8, 65.0
        );

        // Автобусы
        Bus mersedesBus = new Bus("Mercedes-Benz", "Citaro", 2018, "Германия", "белый", 120, 80.0);
        Bus liazBus = new Bus("ЛиАЗ", "5292", 2016, "Россия", "синий", 90, 12.34);
        Bus ikarusBus = new Bus("Ikarus", "280", 1993, "Венгрия", "красный", 75, 99.9);

        // Вывод до заправки
        System.out.println("Автомобили:");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);

        System.out.println("\nПоезда:");
        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println("\nАвтобусы:");
        System.out.println(mersedesBus);
        System.out.println(liazBus);
        System.out.println(ikarusBus);

        // Заправка
        System.out.println("\nЗаправка транспорта:");
        lada.refill();
        audi.refill();
        bmw.refill();

        lastochka.refill();
        leningrad.refill();

        mersedesBus.refill();
        liazBus.refill();
        ikarusBus.refill();

        // Вывод после заправки
        System.out.println("\nПосле заправки:");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);

        System.out.println(lastochka);
        System.out.println(leningrad);

        System.out.println(mersedesBus);
        System.out.println(liazBus);
        System.out.println(ikarusBus);
    }
}

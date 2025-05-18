public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 180, 1.7);
        Car audi = new Car("Audi", "A8", 2020, "Германия", "черный", 250, 3.0);
        Car bmw = new Car("BMW", "Z8", 2021, "Германия", null, -100, -2.0);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
    }
}

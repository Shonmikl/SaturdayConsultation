package saturday.patterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory bmwFactory = new BMWFactory();
        Car car = bmwFactory.getCar();
        Bike bike = bmwFactory.getBike();

        AbstractFactory mercFactory = new MercedesFactory();
        Car car1 = mercFactory.getCar();
        Bike bike1 = mercFactory.getBike();

        car.drive();
        bike.drive();
    }
}
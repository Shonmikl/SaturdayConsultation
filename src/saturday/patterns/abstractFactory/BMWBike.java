package saturday.patterns.abstractFactory;

public class BMWBike implements Bike {
    @Override
    public void drive() {
        System.out.println("BMWBike implements Bike");
    }
}
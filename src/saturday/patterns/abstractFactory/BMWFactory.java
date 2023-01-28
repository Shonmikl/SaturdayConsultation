package saturday.patterns.abstractFactory;

public class BMWFactory implements AbstractFactory{
    @Override
    public Car getCar() {
        return new BMWCar();
    }

    @Override
    public Bike getBike() {
        return new BMWBike();
    }
}
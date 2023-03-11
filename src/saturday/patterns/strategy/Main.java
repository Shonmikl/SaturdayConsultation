package saturday.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        Car car = new BMW(new FlyCar());
        car.fly();

        Car track = new BMW(new NoFlyCar());
        track.fly();
    }
}
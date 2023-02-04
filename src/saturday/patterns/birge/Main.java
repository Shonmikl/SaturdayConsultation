package saturday.patterns.birge;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Audi());
        Vehicle vehicle1 = new Track(new BMW());
        Vehicle vehicle2 = new Car(new VW());

        vehicle.drive();
        vehicle1.drive();
        vehicle2.drive();
    }
}
package saturday.patterns.birge;

public abstract class Vehicle {
    Drivable drivable;

    public Vehicle(Drivable drivable) {
        this.drivable = drivable;
    }

    abstract void drive();
}

class Car extends Vehicle {

    public Car(Drivable drivable) {
        super(drivable);
    }

    @Override
    void drive() {
        drivable.drive("CAR");
    }
}

class Track extends Vehicle {

    public Track(Drivable drivable) {
        super(drivable);
    }

    @Override
    void drive() {
        drivable.drive("TRACK");
    }
}
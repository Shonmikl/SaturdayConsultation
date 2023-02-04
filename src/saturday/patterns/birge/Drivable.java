package saturday.patterns.birge;

public interface Drivable {
    void drive(String str);
}

class Audi implements Drivable {
    @Override
    public void drive(String str) {
        System.out.println("AUDI: " + str);
    }
}

class BMW implements Drivable {
    @Override
    public void drive(String str) {
        System.out.println("BMW: " + str);
    }
}

class VW implements Drivable {
    @Override
    public void drive(String str) {
        System.out.println("VW: " + str);
    }
}

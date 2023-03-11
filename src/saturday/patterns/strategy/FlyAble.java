package saturday.patterns.strategy;

public interface FlyAble {
    void fly();
}

class FlyCar implements FlyAble {
    @Override
    public void fly() {
        System.out.println("FLY");
    }
}

class NoFlyCar implements FlyAble {

    @Override
    public void fly() {
        System.out.println("NO FLY");
    }
}

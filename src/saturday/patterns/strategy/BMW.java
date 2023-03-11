package saturday.patterns.strategy;

public class BMW extends Car {
    public BMW(FlyAble flyAble) {
        super(flyAble);
    }
}

class TRACK extends Car {
    public TRACK(FlyAble flyAble) {
        super(flyAble);
    }
}
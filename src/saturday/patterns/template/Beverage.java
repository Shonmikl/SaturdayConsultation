package saturday.patterns.template;

public abstract class Beverage {
    abstract void addBeverage();
    abstract void addCondiment();
    abstract void addSmth();
    private void boilWater() {
        System.out.println("Water boiled");
    }

    private void addSugar() {
        System.out.println("Sugar added");
    }

    void hook() {

    }

    public void makeBeverage() {
        boilWater();
        addBeverage();
        addCondiment();
        addSugar();
        hook();
    }

}

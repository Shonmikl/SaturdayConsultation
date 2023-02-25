package saturday.patterns.factory_method;

public class MercedesFactory extends AbstractCarFactory {

    @Override
    Car getCar() {
        return new Mercedes();
    }
}
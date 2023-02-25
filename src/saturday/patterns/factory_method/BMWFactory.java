package saturday.patterns.factory_method;

public class BMWFactory extends AbstractCarFactory {

    @Override
    Car getCar(){
        return new BMW();
    }
}
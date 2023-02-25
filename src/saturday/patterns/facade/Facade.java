package saturday.patterns.facade;

public class Facade {
    TV tv = new TV();
    AirCondition airCondition = new AirCondition();
    Light light = new Light();

    public void pressButton(String channel, String temperature) {
        tv.playChannel(channel);
        airCondition.setTemperature(temperature);
        light.turnLight();
    }
}

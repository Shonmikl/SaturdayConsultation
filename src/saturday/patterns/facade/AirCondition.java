package saturday.patterns.facade;

public class AirCondition {
    void setTemperature(String temperature) {
        System.out.println("Set temperature: " + temperature);
    }
}

class Light {
    void turnLight() {
        System.out.println("Light is on");
    }
}

class TV {
    void playChannel(String channel) {
        System.out.println("Play channel: " + channel);
    }
}
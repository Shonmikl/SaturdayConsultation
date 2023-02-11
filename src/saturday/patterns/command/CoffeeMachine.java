package saturday.patterns.command;

public class CoffeeMachine {
    public void makeCoffee() {
        System.out.println("Making Coffee");
    }
}

class Light {
    boolean isOn;

    public void switchLight() {
        this.isOn = !this.isOn;
        System.out.println("Lights is " + (isOn ? "on" : "off"));
    }

}

class MusicPlayer {
    public void playMusic() {
        System.out.println("Play music");
    }
}

class Phone {
    public void makeCall(String name) {
        System.out.println("Making call " + name);
    }
}

package saturday.patterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CoffeeMachineCommand implements Command {
    CoffeeMachine coffeeMachine;

    @Override
    public void execute() {
        coffeeMachine.makeCoffee();
    }
}

@AllArgsConstructor
class LightAndMusicCommand implements Command {
    Light light;
    MusicPlayer musicPlayer;

    @Override
    public void execute() {
        musicPlayer.playMusic();
        light.switchLight();
    }
}

@AllArgsConstructor
class MusicPlayerCommand implements Command {
    MusicPlayer musicPlayer;

    @Override
    public void execute() {
        musicPlayer.playMusic();
    }
}

@AllArgsConstructor
class PhoneCommand implements Command {
    String name;
    Phone phone;

    @Override
    public void execute() {
        phone.makeCall(name);
    }
}
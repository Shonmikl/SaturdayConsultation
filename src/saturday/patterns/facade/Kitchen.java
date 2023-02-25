package saturday.patterns.facade;

public class Kitchen {
    Facade kitchenFacade = new Facade();
    public void pressButton(String channel, String temperature) {
        kitchenFacade.pressButton(channel, temperature);
    }

}

class LivingRoom {
    Facade livingFacade = new Facade();

    public void pressButton(String channel, String temperature) {
        livingFacade.pressButton(channel, temperature);
    }
}
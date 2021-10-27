package PackOCP11JavaClassDesign.Study04.lamp;

public class Lamp {
    private boolean state;

    public Lamp() {
        this.state = false;
    }

    public Lamp(boolean state) {
        this.state = state;
    }

    public void turnOn() {
        this.state = true;
    }

    public void turnOff() {
        this.state = false;
    }

    public void showState() {
        System.out.println("The lamp is turned " + (this.state ? "on" : "off"));
    }
}

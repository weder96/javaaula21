package PackOCP11JavaClassDesign.Study03.clock;

public class Clock {
    private Pointer pointerHour;
    private Pointer pointerMinute;
    private Pointer pointerSecond;

    public void setClock(int h, int m, int s) {
       pointerHour.setPosition(h);
       pointerMinute.setPosition(m);
       pointerSecond.setPosition(s);
    }

    public int showHour() {
        return this.pointerHour.getPosition();
    }

    public int showMinute() {
        return this.pointerMinute.getPosition();
    }

    public int showSecond() {
        return this.pointerSecond.getPosition();
    }
}

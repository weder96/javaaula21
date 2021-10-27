package PackOCP11JavaClassDesign.Study01.car;

public class Door {
    private boolean isOpened;

    /**
     * The Door class Constructor
     */
    public Door() {
        this.setState(false);
    }

    /**
     * Set the door state (opened = true or closed = false)
     *
     * @param newState The new Door's state
     */
    public void setState(boolean newState) {
        this.isOpened = newState;
    }

    /**
     * Get the door's state
     *
     * @return The door's state
     */
    public boolean getState() {
        return this.isOpened;
    }
}

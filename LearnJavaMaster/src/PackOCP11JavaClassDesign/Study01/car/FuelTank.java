package PackOCP11JavaClassDesign.Study01.car;

public class FuelTank {
    private int capacity;
    private int currentLevel;

    /**
     * The FuelTank class Constructor
     *
     * @param _capacity The fuel tank capacity
     */
    public FuelTank(int _capacity) {
        this.setCapacity(_capacity);
        // The car is initialized with full tank
        this.fillTank(_capacity);
    }

    /**
     * Sets the Fuel Tank Capacity
     *
     * @param _newCapacity The new fuel tank capacity
     */
    public void setCapacity(int newCapacity) {
        if (newCapacity < 0) {
            System.out.println("[setCapacity()]: The tank capacity must to be a positive number");
        }
        this.capacity = newCapacity;
    }

    /**
     * Fill up the Fuel Tank
     *
     * @param newLevel The new Fuel Tank Level
     */
    public void fillTank(int newLevel) {
        if (newLevel < 0) {
            System.out.println("[fillTank()]: The tank level must to be a positive number");
        } else if (newLevel > this.getCapacity()) {
            System.out.println("[fillTank()]: The tank level must to be between 0 and " + this.getCapacity());
        } else {
            this.currentLevel = newLevel;
        }
    }

    /**
     * Decrease the Fuel Tank Level
     *
     * @param decreased The amount to decrease from the Fuel Tank
     */
    public void decreaseLevel(int decreased) {
        this.fillTank(this.getLevel() - decreased);
    }

    /**
     * Increase the Fuel Tank Level
     *
     * @param increased The fuel amount to increase on Fuel Tank
     */
    public void increaseLevel(int increased) {
        this.fillTank(this.getLevel() + increased);
    }

    /**
     * Gets the Fuel Tank capacity
     *
     * @return The fuel tank capacity
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Gets the Fuel Tank Level
     *
     * @return The fuel tank level
     */
    public int getLevel() {
        return this.currentLevel;
    }
}

package PackOCP11JavaClassDesign.Study01.car;

public class Engine {
    private boolean isWorking;
    private String  displacement;
    private String  fuelType;

    /**
     * The Engine class constructor
     *
     * @param _displacement The Engine Displacement (Ex: "1.0", "1.6", "1.8"...)
     * @param _fuelType     The Engine Fuel Type (Ex: "gasoline", "alcohol", "flex")
     */
    public Engine(String _displacement, String _fuelType) {
        this.setState(false);
        this.setDisplacement(_displacement);
        this.setFuelType(_fuelType);
    }

    /**
     * Sets the Engine State
     *
     * @param newState The new Engine State
     */
    public void setState(boolean newState) {
        this.isWorking = newState;
    }

    /**
     * Sets the Engine Displacement
     *
     * @param newDisplacement The new Engine Displacement
     */
    public void setDisplacement(String newDisplacement) {
        this.displacement = newDisplacement;
    }

    /**
     * Sets the Engine Fuel Type
     *
     * @param newFuelType The new Engine Fuel Type
     */
    public void setFuelType(String newFuelType) {
        this.fuelType = newFuelType;
    }

    /**
     * Gets the Engine's State
     *
     * @return The Engine's State
     */
    public boolean getState() {
        return this.isWorking;
    }

    /**
     * Gets the Engine's Displacement
     *
     * @return The Engine's Displacement
     */
    public String getDisplacement() {
        return this.displacement;
    }

    /**
     * Gets the Engine's Fuel Type
     *
     * @return The Engine's Fuel Type
     */
    public String getFuelType() {
        return this.fuelType;
    }
}

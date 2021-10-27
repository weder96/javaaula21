package PackOCP11JavaClassDesign.Study01.car;

public class Tire {
    private int size;
    private int pressure;


    /*
     * The Tire class Constructor
     *
     * @param _size     The tire size (Ex: 14, 16, 18...)
     * @param _pressure The tire pressure (Ex: 30)
     */
    public Tire(int _size, int _pressure) {
        this.setSize(_size);
        this.setPressure(_pressure);
    }

    /**
     * Set the tire's size
     *
     * @param newSize The new Tire size
     */
    public void setSize(int newSize) {
        if (newSize < 0) {
            System.out.println("[setSize]: The tire size must to be a positive number!");
        } else {
            this.size = newSize;
        }
    }

    /**
     * Set the tire's pressure
     *
     * @param newPressure The new Tire pressure
     */
    public void setPressure(int newPressure) {
        if (newPressure < 0) {
            System.out.println("[setPressure]: The tire pressure must to be a positive number!");
        } else {
            this.pressure = newPressure;
        }
    }

    /**
     * Gets the Tire's size
     *
     * @return The tire's size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Gets the tire's pressure
     *
     * @return The tire's pressure
     */
    public int getPressure() {
        return this.pressure;
    }
}

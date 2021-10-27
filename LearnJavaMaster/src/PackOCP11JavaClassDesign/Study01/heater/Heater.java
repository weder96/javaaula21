package PackOCP11JavaClassDesign.Study01.heater;

/**
 * Write a description of class Heater here.
 *
 * @author Elton Viana
 * @version 1.0.0
 */
public class Heater {
    private int temperature;
    private int min;
    private int max;
    private int increment;

    public Heater(int _min, int _max, int _increment) {
        if (_min > _max) {
            System.out.println("The min value cannot be greater than max, switching values...");
            this.min = _max;
            this.max = _min;
        } else {
            this.min = _min;
            this.max = _max;
        }

        // Assume the initial temperature as the minimum value
        this.temperature = this.min;
        // Set the initial increment value as 5
        this.increment = 5;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setIncrement(int newIncrement) {
        if (newIncrement < 0) {
            System.out.println("[setIncrement()]: The increment value cannot be negative (" + newIncrement + "), nothing changed.");
        } else {
            this.increment = newIncrement;
        }
    }

    public void warmer() {
        this.temperature += this.increment;
        if (this.temperature > this.max) {
            System.out.println("[warmer()]: The temperature cannot be greater than " + this.max + " - Assuming " + this.max + " instead");
            this.temperature = this.max;
        }
    }

    public void cooler() {
        this.temperature -= this.increment;
        if (this.temperature < this.min) {
            System.out.println("[cooler()]: The temperature cannot be less than " + this.min + " - Assuming " + this.min + " instead");
            this.temperature = this.min;
        }
    }
}

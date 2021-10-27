package PackOCP11JavaClassDesign.Study01.car;

public class Car {
    // Car components/structure
    private Engine   engine;
    private FuelTank tank;
    private Door     rightDoor;
    private Door     leftDoor;
    private Tire[]   tires;
    private int      gearNumber;
    private int      currentSpeed;
    private String   color;

    // Control vars
    private boolean isTurnedOn;
    // private int     mileage;
    private int     currentGear;  // N = 0 | R = -1
    private int     milesPerLitre;

    /**
     * Constructor of Car class
     *
     * @param eDisplacement The Engine displacement (Ex: "1.0", "1.6"...)
     * @param eFuelType     The Engine Fuel Type (Ex: "gasoline", "alcohol", "flex"...)
     * @param tSize         The tire size (Ex: 14, 16, 18...)
     * @param tPressure     The tire pressure in PSI (Ex: 30)
     * @param cGearNumber   The number of gears (Ex: 5)
     * @param cColor        The car's color (Ex: "white", "blue", "black"...)
     */
    public Car(String eDisplacement, String eFuelType, int fCapacity, int tSize, int tPressure, int cGearNumber, String cColor) {
        // Initializes the Car's Engine
        this.engine = new Engine(eDisplacement, eFuelType);

        // Initializes the Fuel Tank
        this.tank = new FuelTank(fCapacity);

        // Initializes the Car's Doors
        this.rightDoor = new Door();
        this.leftDoor  = new Door();

        // Initializes all Tires
        this.tires = new Tire[4];
        for (int i = 0; i < 4; i++) {
            this.tires[i] = new Tire(tSize, tPressure);
        }

        // Initializes the car's class properties
        this.setGearNumber(cGearNumber);
        this.setColor(cColor);
        this.currentSpeed  = 0;
        this.currentGear   = 0;
        this.isTurnedOn    = false;
        this.milesPerLitre = 8;  // ~ 13Km/L
    }

    /**
     * Set the Gear Number
     *
     * @param newGearNumber The new number of gears
     */
    public void setGearNumber(int newGearNumber) {
        if (newGearNumber <= 0) {
            System.out.println("[setGearNumber()]: The car's gear number must to be a positive number");
        } else {
            this.gearNumber = newGearNumber;
        }
    }

    /**
     * Set the Car's Color
     *
     * @param newColor The new color
     */
    public void setColor(String newColor) {
        this.color = newColor;
    }

    /**
     * Gets the number of gears
     *
     * @return The number of gears
     */
    public int getGearNumber() {
        return this.gearNumber;
    }

    /**
     * Gets the current speed
     *
     * @return The car's current speed
     */
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    /**
     * Gets the car's color
     *
     * @return The car's color
     */
    public String getColor() {
        return this.color;
    }

    /*
    public int getMileage() {
        return this.mileage;
    }
    */

    /**
     * Turn the car on
     */
    public void turnOn() {
        // Close All Doors
        this.rightDoor.setState(false);
        this.leftDoor.setState(false);

        // Verify if the tank has fuel
        if (this.tank.getLevel() > 0) {
            // Start Engine
            this.engine.setState(true);
            this.isTurnedOn = true;
        } else if(this.isTurnedOn) {
            System.out.println("[turnOn()]: The is already turned on.");
        } else {
            System.out.println("[turnOn()]: The car doesn't have gas, please fill up his tank and try again.");
        }
    }

    /**
     * Turn the car off
     */
    public void turnOff() {
        if (this.getCurrentSpeed() > 0) {
            System.out.println("[turnOff()]: The car still in movement make sure you're stopped to turn him off.");
        } else if(!this.isTurnedOn) {
            System.out.println("[turnOff()]: The car is already turned off.");
        } else {
            this.engine.setState(false);
            this.isTurnedOn = false;
        }
    }

    /**
     * Accelerate car
     *
     * @param velocity The velocity to be increased
     */
    public void accelerate(int velocity) {
        if (!this.isTurnedOn) {
            System.out.println("[accelerate()]: You cannot accelerate a turned off car. Turn him on before!");
        } else if (velocity < 0) {
            System.out.println("[accelerate()]: The velocity must to be a positive value");
        } else {
            int consumation = velocity/this.milesPerLitre;
            if (this.tank.getLevel() - consumation > 0) { // It's Ok
                this.currentSpeed += velocity;
                this.tank.decreaseLevel(consumation);
            } else {
                this.currentSpeed = 0;
                this.turnOff();
                System.out.println("[accelerate()]: The car doesn't have gas, please fill up the tank!");
            }
        }
    }

    /**
     * Brake car
     *
     * @param velocity The velocity to be decreased
     */
    public void brake(int velocity) {
        if (!this.isTurnedOn) {
            System.out.println("[brake()]: You cannot brake a turned off car. Turn him on before!");
        } else if (velocity < 0) {
            System.out.println("[brake()]: The velocity must to be a positive value");
        } else {
            int consumation = velocity/this.milesPerLitre;
            if (this.tank.getLevel() - consumation > 0) { // It's Ok
                this.currentSpeed = Math.min(0, this.currentSpeed - velocity);
                this.tank.decreaseLevel(consumation);
            } else {
                this.currentSpeed = 0;
                this.turnOff();
                System.out.println("[brake()]: The car doesn't have gas, please fill up the tank!");
            }
        }
    }

    /**
     * Fill up the tank
     *
     * @param fuelAmount The fuel amount to be increased
     */
    public void fillUpTank(int fuelAmount) {
        this.tank.increaseLevel(fuelAmount);
    }

    /**
     * View the car's dashboard
     */
    public void viewDashboard() {
        System.out.println("---------- Car Dashboard ----------");
        if (this.isTurnedOn) {
            System.out.println("The car is turned on.");
        } else {
            System.out.println("The car is turned off.");
        }
            System.out.println("Current Speed: " + this.getCurrentSpeed() + "mph");
            // System.out.println("Mileage: " + this.getMileage() + " miles");
            System.out.println("Fuel: " + this.tank.getLevel() + "/" + this.tank.getCapacity() + "l");
            if (rightDoor.getState())
                System.out.println("The right door is opened");
            if (leftDoor.getState())
                System.out.println("The left door is opened");

        System.out.println("-----------------------------------");
    }
}

package PackOCP11JavaClassDesign.Study01.clock_display;

/**
 * The NumberDisplayHours class represents a digital number display that can hold
 * values from zero to a given limit. The limit can be specified when creating
 * the display. The values range from zero (inclusive) to limit-1. If used,
 * for example, for the seconds on a digital clock, the limit would be 60,
 * resulting in display values from 0 to 59. When incremented, the display
 * automatically rolls over to zero when reaching the limit.
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class NumberDisplayHours {
    private int limit;
    private int value;
    private boolean show12;

    /**
     * Constructor for objects of class NumberDisplayHours.
     * Set the limit at which the display rolls over.
     */
    public NumberDisplayHours(int rollOverLimit) {
        limit = 24;
        value = 0;
        show12 = rollOverLimit == 12;
    }

    /**
     * Return the current value.
     */
    public int getValue() {
        return value;
    }

    /**
     * Return the display value (that is, the current value as a two-digit
     * String. If the value is less than ten, it will be padded with a leading
     * zero).
     */
    public String getDisplayValue(StringBuilder period) {
        if (show12) {
            // The display method to an 12 hours clock
            period.append((value >= 12) ? "PM" : "AM");
            int tmp = value%12;
            if (tmp == 0) {
                return "12";
            } else if (tmp < 10) {
                return "0" + value;
            } else {
                return "" + value;
            }
        } else {
            // Normal method
            if (value < 10) {
                return "0" + value;
            } else {
                return "" + value;
            }
        }
    }

    /**
     * Set the value of the display to the new specified value. If the new
     * value is less than zero or over the limit, do nothing.
     */
    public void setValue(int replacementValue) {
        if (replacementValue >= 0 && replacementValue < limit) {
            value = replacementValue;
        }
    }

    /**
     * Increment the display value by one, rolling over to zero if the
     * limit is reached.
     */
    public void increment() {
        value = (value + 1) % limit;
    }
}

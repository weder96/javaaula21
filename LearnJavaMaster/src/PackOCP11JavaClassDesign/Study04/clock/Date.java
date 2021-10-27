package PackOCP11JavaClassDesign.Study04.clock;

public class Date {
    public static final boolean FORMATO_12H;
    public static final boolean FORMATO_24H;

    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int second;

    private boolean hasTime;

    static {
        FORMATO_12H = true;
        FORMATO_24H = false;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

        this.hasTime = false;
    }

    public Date(int day, int month, int year, int hour, int minute, int second) {
        this(day, month, year);

        this.hour = hour;
        this.minute = minute;
        this.second = second;

        this.hasTime = true;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void print(boolean format) {
        String toPrint = "" + day + "/" + month + "/" + year;

        if (hasTime) {
            if (format == FORMATO_12H) {
                if (hour > 12) {
                    toPrint += " " + (hour%12 == 0 ? 12 : hour%12) + ":" + minute + ":" + second + " PM";
                } else {
                    toPrint += " " + (hour == 0 ? 12 : hour) + ":" + minute + ":" + second + " AM";
                }
            } else {
                toPrint += " " + hour + ":" + minute + ":" + second;
            }
        }

        System.out.println(toPrint);
    }
}

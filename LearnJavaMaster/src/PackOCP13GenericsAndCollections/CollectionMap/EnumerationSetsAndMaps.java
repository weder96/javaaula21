package PackOCP13GenericsAndCollections.CollectionMap;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumerationSetsAndMaps {
    public static void main(String[] args) {
        EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
        EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
        EnumSet<Weekday> workday = EnumSet.range(Weekday.WEDNESDAY, Weekday.FRIDAY);
        EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);

        Employee employee = new Employee("weder");

        var personInCharge = new EnumMap<Weekday, Employee>(Weekday.class);
        personInCharge.put(Weekday.MONDAY, employee);
        System.out.println(personInCharge);
    }
}

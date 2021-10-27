package PackOCP11JavaClassDesign.Study05.calculate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Application {
    public static Period GoslingAge() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy").withLocale(new Locale("pt", "BR"));

        return Period.between(LocalDate.parse("19/05/1955", fmt), LocalDate.now()).normalized();
    }

    public static Duration seconds3AM() {
        return Duration.between(LocalTime.parse("03:00:00"), LocalTime.now());
    }

    public static void main(String[] args) {
        Period p = GoslingAge();
        System.out.println(p.getYears() + " years, " + p.getMonths() + " months and " + p.getDays() + " days.");

        Duration d = seconds3AM();
        System.out.println(d.getSeconds() + " seconds have passed since today's 3:00 AM");
    }
}

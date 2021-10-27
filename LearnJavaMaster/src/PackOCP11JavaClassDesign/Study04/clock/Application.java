package PackOCP11JavaClassDesign.Study04.clock;

public class Application {
    public static void main(String[] args) {
        Date d1 = new Date(10, 03, 2000, 10, 30, 10);
        d1.print(Date.FORMATO_12H);
        d1.print(Date.FORMATO_24H);

        Date d2 = new Date(15, 06, 2000, 23, 15, 20);
        d2.print(Date.FORMATO_12H);
        d2.print(Date.FORMATO_24H);

        Date d3 = new Date(5, 10, 2005);
        d3.print(Date.FORMATO_12H);
        d3.print(Date.FORMATO_24H);
    }
}

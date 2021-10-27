package PackOCP11JavaClassDesign.Study03.fraction;

public class Application {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 2);
        Fraction f2 = new Fraction(4, 2);

        // Show the result on screen
        System.out.println("f1 = " + f1.getResult());
        System.out.println("f2 = " + f2.getResult());

        // Multiply fractions
        Fraction f3 = f1.multiply(f2);

        // Show the result on screen
        System.out.println("f3 = " + f3.getResult());
    }
}

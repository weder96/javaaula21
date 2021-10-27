package PackOCP11JavaClassDesign.Study03.fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 42;
        this.denominator = 1;
    }

    public Fraction(int _numerator, int _denominator) {
        this.setNumerator(_numerator);
        this.setDenominator(_denominator);
    }

    public void setNumerator(int _numerator) {
        this.numerator = _numerator;
    }

    public void setDenominator(int _denominator) {
        this.denominator = _denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public float getResult() {
        return (float)this.numerator / this.denominator;
    }

    public Fraction multiply(Fraction anotherFraction) {
        Fraction toReturn = new Fraction();
        toReturn.setNumerator(this.getNumerator() * anotherFraction.getNumerator());
        toReturn.setDenominator(this.getDenominator() * anotherFraction.getDenominator());

        return toReturn;
    }
}

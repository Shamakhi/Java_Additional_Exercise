public class Rational{
    private int numerator = 0;
    private int denominator = 0;


    public Rational(int num, int den){
        reduceFraction(num, den);
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }

    private void reduceFraction(int num, int den){
        int greatestDivisor = gcd(num, den);

        numerator = num / greatestDivisor;
        denominator = den / greatestDivisor;
    }

    private int gcd(int x, int y){
        return (y == 0) ? x : gcd(y, x % y);
    }


    public static Rational add(Rational r1, Rational r2){
        return new Rational(((r1.getNumerator() * r2.getDenominator()) +
                             (r2.getNumerator() * r1.getDenominator())),
                             (r1.getDenominator() * r2.getDenominator()));
    }

    public static Rational subtract(Rational r1, Rational r2){
        return new Rational(((r1.getNumerator() * r2.getDenominator()) -
                             (r2.getNumerator() * r1.getDenominator())),
                             (r1.getDenominator() * r2.getDenominator()));
    }

    public static Rational multiply(Rational r1, Rational r2){
        return new Rational((r1.getNumerator() * r2.getNumerator()),
                            (r2.getNumerator() * r2.getDenominator()));
    }

    public static Rational divide(Rational r1, Rational r2){
        if(r1.getDenominator() == 0 || r2.getDenominator() == 0)
            throw new IllegalArgumentException("divide by zero error");

        return new Rational((r1.getNumerator() * r2.getDenominator()),
                            (r1.getDenominator() * r2.getNumerator()));
    }

    public String toString(){
        return String.format("%d/%d", numerator, denominator);
    }

    public String toDoubleString(){
        return String.format("%.2f", (double)numerator / denominator);
    }
}

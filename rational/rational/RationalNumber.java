package rational.rational;

public final class RationalNumber implements Comparable<RationalNumber> {
    public final static RationalNumber ZERO = new RationalNumber(0);
    public final static RationalNumber ONE = new RationalNumber(1);
    public final static RationalNumber MAX_VALUE = new RationalNumber(Integer.MAX_VALUE);
    public final static RationalNumber MIN_VALUE = new RationalNumber(Integer.MIN_VALUE);
    
    public RationalNumber(int numerator) {
        throw new UnsupportedOperationException();
    }
    public RationalNumber(int numerator, int denominator) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    // Maybe
    public RationalNumber(double value) {
        throw new UnsupportedOperationException();
    }

    public int getNumerator() {
        throw new UnsupportedOperationException();
    }
    public int getDenominator() {
        throw new UnsupportedOperationException();
    }

    public RationalNumber plus(RationalNumber other) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }
    public RationalNumber minus(RationalNumber other) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }
    public RationalNumber times(RationalNumber other) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }
    public RationalNumber divides(RationalNumber other) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    // Should these be static?
    public static RationalNumber max(RationalNumber number1, RationalNumber number2, RationalNumber... numbers) {
        throw new UnsupportedOperationException();
    }
    public static RationalNumber min(RationalNumber number1, RationalNumber number2, RationalNumber... numbers) {
        throw new UnsupportedOperationException();
    }

    public RationalNumber negate() {
        throw new UnsupportedOperationException();
    }
    public RationalNumber reciprocate() {
        throw new UnsupportedOperationException();
    }

    // Gets as close as possible to the true value
    public double doubleValue() {
        throw new UnsupportedOperationException();
    }

    public int compareTo(RationalNumber other) {
        throw new UnsupportedOperationException();
    }
}

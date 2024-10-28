package rational.rational;

public final class RationalNumber implements Comparable<RationalNumber> {
    public final static RationalNumber ZERO = new RationalNumber(0);
    public final static RationalNumber ONE = new RationalNumber(1);
    
    public RationalNumber(int numerator) {
        throw new UnsupportedOperationException();
    }
    public RationalNumber(int numerator, int denominator) throws IllegalArgumentException {
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

    public RationalNumber negate() {
        throw new UnsupportedOperationException();
    }
    public RationalNumber reciprocate() {
        throw new UnsupportedOperationException();
    }

    public int compareTo(RationalNumber other) {
        throw new UnsupportedOperationException();
    }
}
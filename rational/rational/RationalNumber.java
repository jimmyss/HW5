package rational.rational;

import java.math.BigInteger;

public final class RationalNumber implements Comparable<RationalNumber> {
    public static final RationalNumber ZERO = new RationalNumber(0);
    public static final RationalNumber ONE = new RationalNumber(1);
    public static final RationalNumber MAX_VALUE = new RationalNumber(Integer.MAX_VALUE);
    public static final RationalNumber MIN_VALUE = new RationalNumber(Integer.MIN_VALUE);
    // TODO: Add smallest possible rationals
    
    public RationalNumber(long numerator) {
        throw new UnsupportedOperationException();
    }
    public RationalNumber(long numerator, long denominator) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }
    public RationalNumber(BigInteger numerator) {
        throw new UnsupportedOperationException();
    }
    public RationalNumber(BigInteger numerator, BigInteger denominator) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public BigInteger getNumerator() {
        throw new UnsupportedOperationException();
    }
    public BigInteger getDenominator() {
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
    public RationalNumber divides(RationalNumber other) throws IllegalArgumentException, ArithmeticException {
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

    // Gets as close as possible to the true value
    public double doubleValue() {
        throw new UnsupportedOperationException();
    }

    public int compareTo(RationalNumber other) {
        throw new UnsupportedOperationException();
    }
}

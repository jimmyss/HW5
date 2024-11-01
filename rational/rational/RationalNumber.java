package rational.rational;

import java.math.BigInteger;

/**
 * Represents an arbitrary-precision rational number consisting of a numerator and denominator.
 * Instances of this class are reduced into the simplest possible form that is still mathematically
 * equivalent. Specifically, the absolute values of the numerator and denominator will be co-prime
 * (or the denominator will be 1), and the denominator is guaranteed to be positive. The only 
 * exception to this rule is the unique rational number represented by 0, which has a numerator of
 * 0 and denominator 1. No RationalNumber can have a denominator of 0.
 * 
 * All mathematical operations are exact.
 */
public final class RationalNumber implements Comparable<RationalNumber> {
    public static final RationalNumber ZERO = new RationalNumber(0);
    public static final RationalNumber ONE = new RationalNumber(1);
    
    /**
     * Constructs a RationalNumber with the given numerator, and denominator 1.
     * @param numeratorn the numerator.
     */
    public RationalNumber(long numerator) {
        throw new UnsupportedOperationException();
    }

    /**
     * Constructs a RationalNumber with the given numerator and denominator. Denominator cannot be 0.
     * @param numerator the numerator.
     * @param denominator the denominator.
     * @throws IllegalArgumentException if denominator is 0.
     */
    public RationalNumber(long numerator, long denominator) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * Constructs a RationalNumber with the given numerator, and denominator 1.
     * @param numerator the numerator.
     */
    public RationalNumber(BigInteger numerator) {
        throw new UnsupportedOperationException();
    }

    /**
     * Constructs a RationalNumber with the given numerator and denominator. Denominator cannot be 0.
     * @param numerator the numerator.
     * @param denominator the denominator.
     * @throws IllegalArgumentException if denominator is equivalent to 0.
     */
    public RationalNumber(BigInteger numerator, BigInteger denominator) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the numerator.
     * @return the numerator.
     */
    public BigInteger getNumerator() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the denominator.
     * @return the denominator.
     */
    public BigInteger getDenominator() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a new RationalNumber mathematically equal to the result of adding this and other RationalNumber.
     * @param other the other RationalNumber to add to this.
     * @returns the result of adding this and other.
     * @throws IllegalArgumentException if other is null.
     */
    public RationalNumber plus(RationalNumber other) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a new RationalNumber mathematically equal to the result of subtracting other from this RationalNumber.
     * @param other the other RationalNumber to subtract from this.
     * @returns the result of subtracting other from this.
     * @throws IllegalArgumentException if other is null.
     */
    public RationalNumber minus(RationalNumber other) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a new RationalNumber mathematically equal to the result of multiplying this and other RationalNumber.
     * @param other the other RationalNumber to multiply with this.
     * @returns the result of multiplying this and other.
     * @throws IllegalArgumentException if other is null.
     */
    public RationalNumber times(RationalNumber other) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a new RationalNumber mathematically equal to the result of dividing this by other RationalNumber.
     * @param other the other RationalNumber to divide this by.
     * @returns the result of this by other.
     * @throws IllegalArgumentException if other is null, or if other is equivalent to the zero RationalNumber.
     */
    public RationalNumber divides(RationalNumber other) throws IllegalArgumentException, ArithmeticException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the mathematical maximum of the RationalNumbers number1, number2, and any other given numbers.
     * @param number1 the first RationalNumber
     * @param number2 the second RationalNumber
     * @param numbers more RationalNumbers
     * @return a RationalNumber equal in value to the greatest of the inputs.
     * @throws IllegalArgumentException if number1 or number2 is null.
     */
    public static RationalNumber max(RationalNumber number1, RationalNumber number2, RationalNumber... numbers) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the mathematical minimum of the RationalNumbers number1, number2, and any other given numbers.
     * @param number1 the first RationalNumber
     * @param number2 the second RationalNumber
     * @param numbers more RationalNumbers
     * @return a RationalNumber equal in value to the least of the inputs.
     * @throws IllegalArgumentException if number1 or number2 is null.
     */
    public static RationalNumber min(RationalNumber number1, RationalNumber number2, RationalNumber... numbers) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a RationalNumber equal in value to the negation of this.
     * @return a RationalNumber such that it plus this is equivalent to 0.
     */
    public RationalNumber negate() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns a RationalNumber equal to the absolute value of this.
     * @return a RationalNumber that has equal magnitude to this, but is guaranteed to be positive or zero.
     */
    public RationalNumber abs() {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the closest possible non-infinite double to the value of this.
     * @return the finite double closer than any other double in value to this.
     */
    public double doubleValue() {
        throw new UnsupportedOperationException();
    }

    /**
     * Implements the mathematical definition of comparison between RationalNumbers.
     * @return a negative integer if this < other, zero if this = other, and a positive integer if this > other.
     * 
     */
    public int compareTo(RationalNumber other) {
        throw new UnsupportedOperationException();
    }
}

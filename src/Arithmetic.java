/**
 * Author: Theng Rathrongroeung
 * This class provides basic arithmetic operations. aa
 * Methods include addition, subtraction, multiplication, division, and modulus.
 */
public class Arithmetic {

    /**
     * Returns the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of {@code a} and {@code b}
     */
    static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Returns the difference between two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of subtracting {@code b} from {@code a}
     */
    static int minus(int a, int b) {
        return a - b;
    }

    /**
     * Returns the product of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the product of {@code a} and {@code b}
     */
    static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns the result of dividing one integer by another.
     * This method performs floating-point division to return a precise result.
     *
     * @param a the numerator
     * @param b the denominator
     * @return the result of dividing {@code a} by {@code b} as a {@code double}
     * @throws ArithmeticException if {@code b} is 0 (division by zero)
     */
    static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    /**
     * Returns the remainder of dividing one integer by another.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the remainder when {@code a} is divided by {@code b}
     * @throws ArithmeticException if {@code b} is 0 (modulus by zero)
     */
    static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed.");
        }
        return a % b;
    }
}

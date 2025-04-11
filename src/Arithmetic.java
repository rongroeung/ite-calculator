/**
 * Author: Theng Rathrongroeung
 * This class provides basic arithmetic operations.
 * Methods include sum, minus, multiply, divide, and modulo.
 */
public class Arithmetic {

    /**
     * Returns the sum of two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of {a} and {b}
     */
    static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Returns the result of subtracting between two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of subtracting {b} from {a}
     */
    static int minus(int a, int b) {
        return a - b;
    }

    /**
     * Returns the result of multiplying between two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of multiplying between {a} and {b}
     */
    static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Returns the result of dividing one integer by another.
     * This method performs floating-point division to return a precise result.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the result of dividing {a} by {b} as a {double}
     * @throws ArithmeticException if {b} is 0 (division by zero)
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
     * @return the remainder when {a} is divided by {b}
     * @throws ArithmeticException if {b} is 0 (modulus by zero)
     */
    static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo by zero is not allowed.");
        }
        return a % b;
    }
}

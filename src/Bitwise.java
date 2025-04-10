/**
 * Author: Theng Rathrongroeung
 * This class provides methods to perform various bitwise operations.
 */
public class Bitwise {

    /**
     * Performs a logical AND operation on two integers.
     *
     * @param a First integer input.
     * @param b Second integer input.
     * @return Result of a AND b.
     */
    public int logicalAND(int a, int b) {
        return a & b;
    }

    /**
     * Performs a logical OR operation on two integers.
     *
     * @param a First integer input.
     * @param b Second integer input.
     * @return Result of a OR b.
     */
    public int logicalOR(int a, int b) {
        return a | b;
    }

    /**
     * Performs a logical XOR operation on two integers.
     *
     * @param a First integer input.
     * @param b Second integer input.
     * @return Result of a XOR b.
     */
    public int XOR(int a, int b) {
        return a ^ b;
    }

    /**
     * Performs a bitwise inversion operation on an integer.
     *
     * @param a Integer input to invert.
     * @return Bitwise inversion of a.
     */
    public int bitwiseInversion(int a) {
        return ~a;
    }

    /**
     * Performs a left shift operation on an integer.
     *
     * @param a Integer input.
     * @param positions Number of positions to shift left.
     * @return Result of left-shifting a by the specified positions.
     */
    public int leftShift(int a, int positions) {
        return a << positions;
    }

    /**
     * Performs a right shift operation on an integer.
     *
     * @param a Integer input.
     * @param positions Number of positions to shift right.
     * @return Result of right-shifting a by the specified positions.
     */
    public int rightShift(int a, int positions) {
        return a >> positions;
    }
}
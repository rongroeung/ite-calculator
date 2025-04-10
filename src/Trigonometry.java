/**
 * Author: Theng Rathrongroeung
 * This class provides trigonometric and mathematical utilities
 * including sin, cos, tan, and power operations.
 */
public class Trigonometry {

    /**
     * Calculates the sine of the given angle in radians.
     *
     * @param radian the angle in radians
     * @return the sine value
     */
    public float sin(float radian) {
        return (float) Math.sin(radian);
    }

    /**
     * Calculates the sine of the given angle in degrees.
     *
     * @param degree the angle in degrees
     * @return the sine value
     */
    public float sind(int degree) {
        return (float) Math.sin(Math.toRadians(degree));
    }

    /**
     * Calculates the cosine of the given angle in radians.
     *
     * @param radian the angle in radians
     * @return the cosine value
     */
    public float cos(float radian) {
        return (float) Math.cos(radian);
    }

    /**
     * Calculates the cosine of the given angle in degrees.
     *
     * @param degree the angle in degrees
     * @return the cosine value
     */
    public float cosd(int degree) {
        return (float) Math.cos(Math.toRadians(degree));
    }

    /**
     * Calculates the tangent of the given angle in radians.
     *
     * @param radian the angle in radians
     * @return the tangent value
     */
    public float tan(float radian) {
        return (float) Math.tan(radian);
    }

    /**
     * Calculates the tangent of the given angle in degrees.
     *
     * @param degree the angle in degrees
     * @return the tangent value
     */
    public float tand(int degree) {
        return (float) Math.tan(Math.toRadians(degree));
    }

    /**
     * Calculates the square of a given long integer.
     *
     * @param x the long integer
     * @return the square of the number
     */
    public long square2(long x) {
        return x * x;
    }

    /**
     * Calculates the square of a given double.
     *
     * @param x the double value
     * @return the square of the number
     */
    public double square2(double x) {
        return x * x;
    }

    /**
     * Calculates the cube of a given long integer.
     *
     * @param x the long integer
     * @return the cube of the number
     */
    public long square3(long x) {
        return x * x * x;
    }

    /**
     * Calculates the cube of a given double.
     *
     * @param x the double value
     * @return the cube of the number
     */
    public double square3(double x) {
        return x * x * x;
    }

    /**
     * Converts an angle in degrees to radians.
     *
     * @param degree the angle in degrees
     * @return the angle converted to radians
     */
    public double degree2Radian(int degree) {
        return Math.toRadians(degree);
    }

    /**
     * Converts an angle in radians to degrees.
     *
     * @param radian the angle in radians
     * @return the angle converted to degrees
     */
    public int radian2Degree(double radian) {
        return (int) Math.toDegrees(radian);
    }
}
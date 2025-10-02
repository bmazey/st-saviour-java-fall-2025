package interview;

public class Estimator {

    /*
     * The round() method accepts a double d and returns an int.
     * The resulting integer should be rounded up when the decimal is >= .5
     * Negative numbers should also be rounded up, but the result should remain
     * negative.
     * - ex: 1.2 -> 1
     * - ex: -3.6 -> -4
     */
    public static int round(double d) {
        // TODO
        int a = (int) d;
        double r = d - a;

        if (r >= 0.5) {
            return a + 1;
        }
        if (r <= -0.5) {
            return a - 1;
        }
        return a;
    }
}

package TimeConvert;

public class Day {
    public static double Day2MS(double time) {
        time = time * 1000 * Math.pow(60, 2) * 24;
        return time;
    }

    public static double Day2Sec(double time) {
        time = time * Math.pow(60, 2) * 24;
        return time;
    }

    public static double Day2Min(double time) {
        time = time * 60 * 24;
        return time;
    }

    public static double Day2HR(double time) {
        time = time * 24;
        return time;
    }

    public static double Day2WK(double time ) {
        time = time / 7;
        return time;
    }

    public static double Day2YR(double time) {
        time = time / 365;
        return time;
    }
}

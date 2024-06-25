package TimeConvert;

public class Week {
    public static double WK2MS(double time) {
        time = time * 1000 * Math.pow(60, 2) * 24 * 7;
        return time;
    }

    public static double WK2Sec(double time) {
        time = time * Math.pow(60, 2) * 24 * 7;
        return time;
    }

    public static double WK2Min(double time) {
        time = time * 60 * 24 * 7;
        return time;
    }

    public static double WK2HR(double time) {
        time = time * 24 * 7;
        return time;
    }

    public static double WK2Day(double time) {
        time = time * 7;
        return time;
    }

    public static double WK2YR(double time) {
        time = time / 52;
        return time;
    }
}

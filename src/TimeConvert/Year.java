package TimeConvert;
public class Year {
    public static double YR2MS(double time) {
        time = time * 1000 * Math.pow(60, 2) * 24 * 365;
        return time;
    }

    public static double YR2Sec(double time) {
        time = time * Math.pow(60, 2) * 24 * 365;
        return time;
    }

    public static double YR2Min(double time) {
        time = time * 60 * 24 * 365;
        return time;
    }

    public static double YR2HR(double time) {
        time = time * 24 * 365;
        return time;
    }

    public static double YR2Day(double time) {
        time = time * 365;
        return time;
    }

    public static double YR2WK(double time) {
        time = time * 52;
        return time;
    }
}

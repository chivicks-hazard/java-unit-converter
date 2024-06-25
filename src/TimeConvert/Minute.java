package TimeConvert;

public class Minute {
    public static double Min2MS(double time) {
        time = time * 60 * 1000;
        return time;
    }

    public static double Min2Sec(double time) {
        time = time * 60;
        return time;
    }

    public static double Min2HR(double time) {
        time = time / 60;
        return time;
    }

    public static double Min2Day(double time) {
        time = time / (60 * 24);
        return time;
    }

    public static double Min2WK(double time) {
        time = time / (60 * 24 * 7);
        return time;
    }

    public static double Min2YR(double time) {
        time = time / (60 * 24 * 365);
        return time;
    }
}

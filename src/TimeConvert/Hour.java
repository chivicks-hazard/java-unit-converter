package TimeConvert;

public class Hour {
    public static double HR2MS(double time) {
        time = time * (1000 * Math.pow(60, 2));
        return time;
    }

    public static double HR2Sec(double time) {
        time = time * Math.pow(60, 2);
        return time;
    }

    public static double HR2Min(double time) {
        time = time * 60;
        return time;
    }

    public static double HR2Day(double time) {
        time = time / 24;
        return time;
    }

    public static double HR2WK(double time) {
        time = time / (24 * 7);
        return time;
    }

    public static double HR2YR(double time) {
        time = time / (24 * 365);
        return time;
    }
}
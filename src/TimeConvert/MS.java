package TimeConvert;

public class MS {
    public static double MS2Sec(double time) {
        time = time / 1000;
        return time;
    }

    public static double MS2Min(double time) {
        time = time / (1000 * 60);
        return time;
    }

    public static double MS2Hour(double time) {
        time = time / (1000 * Math.pow(60, 2));
        return time;
    }

    public static double MS2Day(double time) {
        time = time / (1000 * Math.pow(60, 2) * 24);
        return time;
    }

    public static double MS2Week(double time) {
        time = time / (1000 * Math.pow(60, 2) * 24 * 7);
        return time;
    }

    public static double MS2Year(double time) {
        time = time / (1000 * Math.pow(60, 2) * 24 * 365);
        return time;
    }
}

package TimeConvert;

public class Second {
    public static double Sec2MS(double time) {
        time = time * 1000;
        return time;
    }

    public static double Sec2Min(double time) {
        time = time / 60;
        return time;
    }

    public static double Sec2HR(double time) {
        time = time / Math.pow(60, 2);
        return time;
    }

    public static double Sec2Day(double time) {
        time = time / (Math.pow(60, 2) * 24);
        return time;
    }
    
    public static double Sec2WK(double time) {
        time = time / (Math.pow(60, 2) * 24 * 7);
        return time;
    }

    public static double Sec2YR(double time) {
        time = time / (Math.pow(60, 2) * 24 * 365);
        return time;
    }
}

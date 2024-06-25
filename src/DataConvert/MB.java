package DataConvert;

public class MB {
    public static double MB2Bit(double data) {
        data = data * (8 * Math.pow(1024, 2));
        return data;
    }

    public static double MB2Byte(double data) {
        data = data * Math.pow(1024, 2);
        return data;
    }

    public static double MB2KB(double data) {
        data = data * 1024;
        return data;
    }

    public static double MB2GB(double data) {
        data = data / 1024;
        return data;
    }

    public static double MB2TB(double data) {
        data = data / Math.pow(1024, 2);
        return data;
    }
}

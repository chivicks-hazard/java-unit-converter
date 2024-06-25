package DataConvert;

public class TB {
    public static double TB2Bit(double data) {
        data = data * (8 * Math.pow(1024, 4));
        return data;
    }

    public static double TB2Byte(double data) {
        data = data * Math.pow(1024, 4);
        return data;
    }

    public static double TB2KB(double data) {
        data = data * Math.pow(1024, 3);
        return data;
    }

    public static double TB2MB(double data) {
        data = data * Math.pow(1024, 2);
        return data;
    }

    public static double TB2GB(double data) {
        data = data * 1024;
        return data;
    }
}

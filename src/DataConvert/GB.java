package DataConvert;

public class GB {
    public static double GB2Bit(double data) {
        data = data * (8 * Math.pow(1024, 3));
        return data;
    }

    public static double GB2Byte(double data) {
        data = data * Math.pow(1024, 3);
        return data;
    }

    public static double GB2KB(double data) {
        data = data * Math.pow(1024, 2);
        return data;
    }

    public static double GB2MB(double data) {
        data = data * 1024;
        return data;
    }

    public static double GB2TB(double data) {
        data = data / 1024;
        return data;
    }
}

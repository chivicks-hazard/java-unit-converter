package DataConvert;

public class KB {
    public static double KB2Bit(double data) {
        data = data * (8 * 1024);
        return data;
    }

    public static double KB2Byte(double data) {
        data = data * 1024;
        return data;
    }

    public static double KB2MB(double data) {
        data = data / 1024;
        return data;
    }

    public static double KB2GB(double data) {
        data = data / Math.pow(1024, 2);
        return data;
    }

    public static double KB2TB(double data) {
        data = data / Math.pow(1024, 3);
        return data;
    }
}

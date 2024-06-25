package DataConvert;

public class Byte {
    public static double Byte2Bit(double data) {
        data = data * 8;
        return data;
    }

    public static double Byte2KB(double data) {
        data = data / 1024;
        return data;
    }

    public static double Byte2MB(double data) {
        data = data / Math.pow(1024, 2);
        return data;
    }
    
    public static double Byte2GB(double data) {
        data = data / Math.pow(1024, 3);
        return data;
    }
    public static double Byte2TB(double data) {
        data = data / Math.pow(1024, 4);
        return data;
    }
}

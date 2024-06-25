package DataConvert;

public class Bit {
    public static double Bit2Byte(double data) {
        data = data / 8;
        return data;
    }

    public static double Bit2KB(double data) {
        data = data / (8 * 1024);
        return data;
    }

    public static double Bit2MB(double data) {
        data = data /( 8 * Math.pow(1024, 2));
        return data;
    }
    
    public static double Bit2GB(double data) {
        data = data / (8 * Math.pow(1024, 3));
        return data;
    }
    public static double Bit2TB(double data) {
        data = data / (8 * Math.pow(1024, 3));
        return data;
    }
}

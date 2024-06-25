package LengConvert;

public class Feet {
    public static double FT2MM(double length) {
        length = length * 304.8;
        return length;
    }

    public static double FT2CM (double length) {
        length = length * 30.48;
        return length;
    }

    public static double FT2M(double length) {
        length = length / 3.280839895;
        return length;
    }

    public static double FT2KM(double length) {
        length = length / 3280.8398950131;
        return length;
    }

    public static double FT2IN(double length) {
        length = length / 12;
        return length;
    }

    public static double FT2YD(double length) {
        length = length / 3;
        return length;
    }

    public static double FT2MI(double length) {
        length = length / 5280;
        return length;
    }

    public static double FT2NM(double length) {
        length = length / 6076.1154855643;
        return length;
    }
}

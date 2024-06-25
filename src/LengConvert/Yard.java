package LengConvert;

public class Yard {
    public static double YD2MM(double length) {
        length = length * 914.4;
        return length;
    }

    public static double YD2CM(double length) {
        length = length * 91.44;
        return length;
    }

    public static double YD2M(double length) {
        length = length / 3.280839895;
        return length;
    }

    public static double YD2KM(double length) {
        length = length / 3280.8398950131;
        return length;
    }

    public static double YD2IN(double length) {
        length = length * 12;
        return length;
    }

    public static double YD2FT(double length) {
        length = length * 3;
        return length;
    }

    public static double YD2MI(double length) {
        length = length / 1760;
        return length;
    }

    public static double YD2NM(double length) {
        length = length / 2025.3718285214;
        return length;
    }
}

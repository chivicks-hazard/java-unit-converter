package LengConvert;

public class Kilometre {
    public static double KM2MM(double length) {
        length = length * 1_000_000;
        return length;
    }

    public static double KM2CM(double length) {
        length = length * 100_000;
        return length;
    }

    public static double KM2M(double length) {
        length = length * 1000;
        return length;
    }

    public static double KM2IN(double length) {
        length = length * 39_370.078740157;
        return length;
    }

    public static double KM2FT(double length) {
        length = length * 3280.8398950131;
        return length;
    }

    public static double KM2YD(double length) {
        length = length * 1093.6132983377;
        return length;
    }

    public static double KM2MI(double length) {
        length = length / 1.609344;
        return length;
    }

    public static double KM2NM(double length) {
        length = length / 1.852;
        return length;
    }
}

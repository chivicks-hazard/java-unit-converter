package LengConvert;

public class Centimetre {
    public static double CM2MM(double length) {
        length = length * 10;
        return length;
    }

    public static double CM2M(double length) {
        length = length / 100;
        return length;
    }

    public static double CM2KM(double length) {
        length = length * 100_000;
        return length;
    }

    public static double CM2IN(double length) {
        length = length / 2.54;
        return length;
    }

    public static double CM2FT(double length) {
        length = length / 30.48;
        return length;
    }

    public static double CM2YD(double length) {
        length = length / 91.44;
        return length;
    }

    public static double CM2MI(double length) {
        length = length / 160_934.4;
        return length;
    }

    public static double CM2NM(double length) {
        length = length / 185_200;
        return length;
    }
}

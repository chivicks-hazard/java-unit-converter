package LengConvert;

public class Metre {
    public static double M2MM(double length) {
        length = length * 1000;
        return length;
    }

    public static double M2CM(double length) {
        length = length * 100;
        return length;
    }

    public static double M2KM(double length) {
        length = length / 1000;
        return length;
    }

    public static double M2IN(double length) {
        length = length * 39.3700787402;
        return length;
    }

    public static double M2FT(double length) {
        length = length * 3.280839895;
        return length;
    }

    public static double M2YD(double length) {
        length = length * 1.0936132983;
        return length;
    }

    public static double M2MI(double length) {
        length = length / 1609.344;
        return length;
    }

    public static double M2NM(double length) {
        length = length / 1852;
        return length;
    }
}

package LengConvert;

public class Millimetre {
    public static double MM2CM(double length) {
        length = length * 10;
        return length;
    }

    public static double MM2M(double length) {
        length = length * 1000;
        return length;
    }

    public static double MM2KM(double length) {
        length = length * 1_000_000;
        return length;
    }

    public static double MM2IN(double length) {
        length = length / 25.4;
        return length;
    }

    public static double MM2FT(double length) {
        length = length / 304.8;
        return length;
    }

    public static double MM2YD(double length) {
        length = length / 914.4;
        return length;
    }

    public static double MM2MI(double length) {
        length = length / 1_609_344;
        return length;
    }

    public static double MM2NM(double length) {
        length = length / 1_852_000;
        return length;
    }
}

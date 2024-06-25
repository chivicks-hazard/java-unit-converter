package LengConvert;

public class Mile {
    public static double MI2MM(double length) {
        length = length * 1_609_344;
        return length;
    }

    public static double MI2CM(double length) {
        length = length * 160_934.4;
        return length;
    }

    public static double MI2M(double length) {
        length = length * 1609.344;
        return length;
    }

    public static double MI2KM(double length) {
        length = length * 1.609344;
        return length;
    }

    public static double MI2IN(double length) {
        length = length * 63_360;
        return length;
    }

    public static double MI2FT(double length) {
        length = length * 5280;
        return length;
    }

    public static double MI2YD(double length) {
        length = length * 1760;
        return length;
    }

    public static double MI2NM(double length) {
        length = length / 1.150779448;
        return length;
    }
}

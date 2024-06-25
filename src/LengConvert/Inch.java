package LengConvert;

public class Inch {
    public static double IN2MM(double length) {
        length = length * 25.4;
        return length;
    }

    public static double IN2CM(double length) {
        length = length * 2.54;
        return length;
    }

    public static double IN2M(double length) {
        length = length / 39.3700787402;
        return length;
    }

    public static double IN2KM(double length) {
        length = length * 39_370.078740157;
        return length;
    }

    public static double IN2FT(double length) {
        length = length / 12;
        return length;
    }

    public static double IN2YD(double length) {
        length = length / 36;
        return length;
    }

    public static double IN2MI(double length) {
        length = length / 63_360;
        return length;
    }

    public static double IN2NM(double length) {
        length = length / 72_913.385826772;
        return length;
    }
}

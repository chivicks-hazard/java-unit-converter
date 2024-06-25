package LengConvert;

public class NautMile {
    public static double NM2MM(double length) {
        length = length * 1_852_000;
        return length;
    }

    public static double NM2CM(double length) {
        length = length * 185_200;
        return length;
    }

    public static double NM2M(double length) {
        length = length / 1852;
        return length;
    }

    public static double NM2KM(double length) {
        length = length * 1.852;
        return length;
    }

    public static double NM2IN(double length) {
        length = length * 72_913.385826772;
        return length;
    }

    public static double NM2FT(double length) {
        length = length * 6076.1154855643;
        return length;
    }

    public static double NM2YD(double length) {
        length = length * 2025.3718285214;
        return length;
    }

    public static double NM2MI(double length) {
        length = length * 1.150779448;
        return length;
    }
}

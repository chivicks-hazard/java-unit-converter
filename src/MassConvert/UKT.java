package MassConvert;

public class UKT {
    public static double UKT2Gram(double mass) {
        mass = mass * 1_016_046.9088;
        return mass;
    }

    public static double UKT2KG(double mass) {
        mass = mass * 1016.0469088;
        return mass;
    }

    public static double UKT2Ton(double mass) {
        mass = mass * 1.0160469088;
        return mass;
    }

    public static double UKT2LB(double mass) {
        mass = mass * 2204;
        return mass;
    }

    public static double UKT2OZ(double mass) {
        mass = mass * 35_840;
        return mass;
    }

    public static double UKT2UST(double mass) {
        mass = mass * 1.12;
        return mass;
    }
}

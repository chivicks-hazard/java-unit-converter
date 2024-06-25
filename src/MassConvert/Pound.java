package MassConvert;

public class Pound {
    public static double LB2Gram(double mass) {
        mass = mass * 453.59237;
        return mass;
    }

    public static double LB2KG(double mass) {
        mass = mass / 2.2046226218;
        return mass;
    }

    public static double LB2Ton(double mass) {
        mass = mass / 2204.6226218488;
        return mass;
    }

    public static double LB2OZ(double mass) {
        mass = mass * 16;
        return mass;
    }

    public static double LB2UST(double mass) {
        mass = mass / 2000;
        return mass;
    }

    public static double LB2UKT(double mass) {
        mass = mass / 2204;
        return mass;
    }
}

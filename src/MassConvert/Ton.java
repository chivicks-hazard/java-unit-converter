package MassConvert;

public class Ton {
    public static double Ton2Gram(double mass) {
        mass = mass * 1_000_000;
        return mass;
    }

    public static double Ton2KG(double mass) {
        mass = mass * 1000;
        return mass;
    }

    public static double Ton2LB(double mass) {
        mass = mass * 2204.6226218488;
        return mass;
    }

    public static double Ton2OZ(double mass) {
        mass = mass * 35_273.96194958;
        return mass;
    }

    public static double Ton2UST(double mass) {
        mass = mass * 1.1023113109;
        return mass;
    }

    public static double Ton2UKT(double mass) {
        mass = mass / 1.0160469088;
        return mass;
    }
}

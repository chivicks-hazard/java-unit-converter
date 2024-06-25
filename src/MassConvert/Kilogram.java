package MassConvert;

public class Kilogram {
    public static double KG2Gram(double mass) {
        mass = mass * 1000;
        return mass;
    }

    public static double KG2Ton(double mass) {
        mass = mass / 1000;
        return mass;
    }

    public static double KG2LB(double mass) {
        mass = mass * 2.2046226218;
        return mass;
    }

    public static double KG2OZ(double mass) {
        mass = mass * 35.2739619496;
        return mass;
    }

    public static double KG2UKT(double mass) {
        mass = mass / 1016.0469088;
        return mass;
    }

    public static double KG2UST(double mass) {
        mass = mass / 907.18474;
        return mass;
    }
}

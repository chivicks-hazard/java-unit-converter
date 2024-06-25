package MassConvert;

public class UST {
    public static double UST2Gram(double mass) {
        mass = mass * 907_184.74;
        return mass;
    }

    public static double UST2KG(double mass) {
        mass = mass * 907.18474;
        return mass;
    }

    public static double UST2Ton(double mass) {
        mass = mass / 1.1023113109;
        return mass;
    }

    public static double UST2LB(double mass) {
        mass = mass * 2000;
        return mass;
    }

    public static double UST2OZ(double mass) {
        mass = mass * 32_000;
        return mass;
    }

    public static double UST2UKT(double mass) {
        mass = mass / 1.12;
        return mass;
    }
}

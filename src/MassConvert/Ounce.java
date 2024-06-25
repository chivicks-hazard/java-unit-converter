package MassConvert;

public class Ounce {
    public static double OZ2Gram(double mass) {
        mass = mass * 28.34;
        return mass;
    }

    public static double OZ2KG(double mass) {
        mass = mass / 35.2739619496;
        return mass;
    }

    public static double OZ2Ton(double mass) {
        mass = mass / 35_273.96194958;
        return mass;
    }

    public static double OZ2LB(double mass) {
        mass = mass / 16;
        return mass;
    }

    public static double OZ2UKT(double mass) {
        mass = mass / 35_840;
        return mass;
    }

    public static double OZ2UST(double mass) {
        mass = mass / 32_000;
        return mass;
    }
}

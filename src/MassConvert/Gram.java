package MassConvert;

public class Gram {
    public static double Gram2KG(double mass) {
        mass = mass / 1000;
        return mass;
    }

    public static double Gram2Ton(double mass) {
        mass = mass / 1_000_000;
        return mass;
    }

    public static double Gram2LB(double mass) {
        mass = mass / 453.59237;
        return mass;
    }

    public static double Gram2OZ(double mass) {
        mass = mass / 28.34;
        return mass;
    }

    public static double Gram2UST(double mass) {
        mass = mass / 907_184.74;
        return mass;
    }

    public static double Gram2UKT(double mass) {
        mass = mass / 1_016_046.9088;
        return mass;
    }
}

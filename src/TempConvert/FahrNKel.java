package TempConvert;

public class FahrNKel {
    public static double Fahr2Kel(double time) {
        time = (((time - 32) * 5) / 9) + 100;
        return time;
    }

    public static double Kel2Fahr(double time) {
        time = (((time - 32) * 5) / 9) + 100;
        return time;
    }
}

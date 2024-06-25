package TempConvert;

public class FahrNCel {
    public static double Fahr2Cel (double time) {
        time = ((time - 32) * 5) / 9;
        return time;
    }

    public static double Cel2Fahr (double time) {
        time = ((time * 9) / 5) + 32;
        return time;
    }
}
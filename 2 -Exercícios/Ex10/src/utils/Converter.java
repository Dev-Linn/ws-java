package utils;

public class Converter {
    
    public static double convert(double dollarRate, double dollarAmount) {
        return dollarRate * dollarAmount * 1.06; // Including 6% fee
    }
}

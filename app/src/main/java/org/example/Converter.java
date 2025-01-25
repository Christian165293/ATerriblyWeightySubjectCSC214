package org.example;

public class Converter {
    public String toPounds(int inputOunces) {
        double lbsOutput = inputOunces / 16.0;
        return String.format("%.4f lbs", lbsOutput);
    }

    public String toPoundsAndOunces(int inputOunces) {
        int lbsOutput = inputOunces / 16;
        int ouncesOutput = inputOunces % 16;
        return String.format("%d lbs %d oz", lbsOutput, ouncesOutput);
    }
}

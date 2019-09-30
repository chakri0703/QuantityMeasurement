package com.bridgelabz.quantity;

public enum Unit {
    feet(12),
    inch(1),
    yard(3 * 12),
    gallon(3.78),
    litre(1);
    private double conversionFactor;

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return value * conversionFactor;
    }


    public Unit getBaseUnit(Unit unit) {
        if (unit == feet || unit == inch || unit == yard) {
            return inch;
        }
        return litre;
    }
}

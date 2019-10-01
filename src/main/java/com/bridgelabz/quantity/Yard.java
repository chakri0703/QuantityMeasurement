package com.bridgelabz.quantity;

public class Yard implements Length {

    public static final double CONVERT_TO_INCH = 36.0;

    @Override
    public double convertToBase(double value) {
        return value * CONVERT_TO_INCH;
    }

    @Override
    public Length getBaseUnit() {
        return new Inch();
    }

    @Override
    public boolean checkBaseUnit(IUnit unit2) {
        return this.getBaseUnit().equals(unit2.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof Length;
    }
}

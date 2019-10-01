package com.bridgelabz.quantity.weight;

import com.bridgelabz.quantity.IUnit;

public class KiloGram implements IUnit {
    public static final double CONVERT_TO_GRAMS=1000.0;
    @Override
    public double convertToBase(double value) {
        return value*CONVERT_TO_GRAMS;
    }

    @Override
    public IUnit getBaseUnit() {
        return null;
    }

    @Override
    public boolean checkBaseUnit(IUnit unit2) {
        return false;
    }
}

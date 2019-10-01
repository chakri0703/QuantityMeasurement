package com.bridgelabz.quantity.temperature;

import com.bridgelabz.quantity.IUnit;

public class Celsius implements ITemperature {
    @Override
    public double convertToBase(double value) {
        return 0;
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

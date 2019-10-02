package com.bridgelabz.quantity;

import com.bridgelabz.quantity.temperature.Celsius;
import com.bridgelabz.quantity.temperature.ITemperature;

public class Fahrenheit implements IUnit {
    @Override
    public double convertToBase(double value) {
        return (value - 32) * 5 / 9;
    }

    @Override
    public IUnit getBaseUnit() {
        return new Celsius();
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
        return obj instanceof ITemperature;
    }
}

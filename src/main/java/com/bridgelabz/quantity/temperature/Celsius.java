package com.bridgelabz.quantity.temperature;

import com.bridgelabz.quantity.IUnit;

public class Celsius implements ITemperature {
    @Override
    public double convertToBase(double value) {
        return value*1;
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
        if (this==obj){
            return true;
        }
        return obj instanceof Celsius;
    }
}

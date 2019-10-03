package com.bridgelabz.quantity;

import com.bridgelabz.quantity.temperature.Celsius;

public class NonAddableQuanatity {

    private final double value;
    private final IUnit unit;

    public NonAddableQuanatity(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static NonAddableQuanatity createCelsius(double value) {
        return new NonAddableQuanatity(value, new Celsius());
    }

    public static NonAddableQuanatity createFahrenheit(double value) {
        return new NonAddableQuanatity(value, new Fahrenheit());
    }

    @Override
    public String toString() {
        return "NonAddableQuantity{" +
                "value=" + value +
                ", unit2=" + unit +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonAddableQuanatity)) {
            return false;
        }
        NonAddableQuanatity other = (NonAddableQuanatity) obj;
        if (!unit.checkBaseUnit(other.unit)) {
            return false;
        }

        return Math.abs(unit.convertToBase(value) - other.unit.convertToBase(other.value)) <= 0.01;
    }
}

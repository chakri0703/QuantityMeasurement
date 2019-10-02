package com.bridgelabz.quantity;

import com.bridgelabz.quantity.temperature.Celsius;

public class NonAddableQuality {

    private final double value;
    private final IUnit unit;

    public NonAddableQuality(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static NonAddableQuality createCelsius(double value) {
        return new NonAddableQuality(value, new Celsius());
    }

    public static NonAddableQuality createFahrenheit(double value) {
        return new NonAddableQuality(value, new Fahrenheit());
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
        if (!(obj instanceof NonAddableQuality)) {
            return false;
        }
        NonAddableQuality other = (NonAddableQuality) obj;
        if (!unit.checkBaseUnit(other.unit)) {
            return false;
        }

        return Math.abs(unit.convertToBase(value) - other.unit.convertToBase(other.value)) <= 0.01;
    }
}

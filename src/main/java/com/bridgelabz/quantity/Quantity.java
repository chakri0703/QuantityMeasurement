package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    private Unit unit;

    public static Quantity createFoot(int value) {
        return new Quantity(value, Unit.feet);
    }

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (!(object instanceof Quantity)) {
            return false;
        }

        Quantity other = (Quantity) object;

        return Math.abs(unit.convertToBase(value) - other.unit.convertToBase(other.value)) <= 0.01;

    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    public Quantity add(Quantity another) {

        return new Quantity(unit.convertToBase(this.value) + another.unit.convertToBase(another.value), Unit.inch);
    }
}



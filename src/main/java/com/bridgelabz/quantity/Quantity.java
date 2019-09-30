package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    private Unit unit;

    public static Quantity createFoot(double value) {
        return new Quantity(value, Unit.feet);
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, Unit.inch);
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, Unit.yard);
    }

    public static Quantity createLitre(double value) {
        return new Quantity(value, Unit.litre);
    }


    public static Quantity createGallon(double value) {
        return new Quantity(value, Unit.gallon);
    }

    private Quantity(double value, Unit unit) {
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
        if (!unit.checkBaseUnit(other.unit)) {
            return false;
        }

        return Math.abs(unit.convertToBase(value) - other.unit.convertToBase(other.value)) <= 0.01;

    }

    public Quantity add(Quantity other) {
        if (!(unit.checkBaseUnit(other.unit))) {
            throw new IllegalArgumentException("Illegal Units");
        }
        return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), this.unit.getBaseUnit());
    }
}


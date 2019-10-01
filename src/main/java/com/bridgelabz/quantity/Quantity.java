package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    private IUnit unit2;
    private Unit unit;

    public static Quantity createFoot(double value) {
        return QuantityFactory.createFoot(value);
    }

    public static Quantity createInch(double value) {
        return QuantityFactory.createInch(value);
    }

    public static Quantity createYard(double value) {
        return QuantityFactory.createYard(value);
    }
    public static Quantity createLitre(double value) {
        return QuantityFactory.createLitre(value);
    }


    public static Quantity createGallon(double value) {
        return QuantityFactory.createGallon(value);
    }


    Quantity(double value, IUnit unit2){
        this.value=value;
        this.unit2 = unit2;
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


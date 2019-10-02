package com.bridgelabz.quantity;

public class Quantity {
    private double value;
    private IUnit unit;

    public static Quantity createFoot(double value) {
        return AddableQuantityFactory.createFoot(value);
    }

    public static Quantity createInch(double value) {
        return AddableQuantityFactory.createInch(value);
    }

    public static Quantity createYard(double value) {
        return AddableQuantityFactory.createYard(value);
    }
    public static Quantity createLitre(double value) {
        return AddableQuantityFactory.createLitre(value);
    }


    public static Quantity createGallon(double value) {
        return AddableQuantityFactory.createGallon(value);
    }

    public static Quantity createKiloGram(double value){
        return AddableQuantityFactory.createKiloGram(value);
    }

    Quantity(double value, IUnit unit){
        this.value=value;
        this.unit = unit;
    }

    public static Quantity createGrams(double value) {
        return  AddableQuantityFactory.createGrams(value);
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

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit2=" + unit +
                '}';
    }

    public Quantity add(Quantity other) {
        if (!unit.checkBaseUnit(other.unit)) {
            throw new IllegalArgumentException("Illegal Units");
        }
        return new Quantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), this.unit.getBaseUnit());
    }
}


package com.bridgelabz.quantity;

public class AddableQuantity extends NonAddableQuanatity {
    private double value;
    private IUnit unit;

    public static AddableQuantity createFoot(double value) {
        return AddableQuantityFactory.createFoot(value);
    }

    public static AddableQuantity createInch(double value) {
        return AddableQuantityFactory.createInch(value);
    }

    public static AddableQuantity createYard(double value) {
        return AddableQuantityFactory.createYard(value);
    }

    public static AddableQuantity createLitre(double value) {
        return AddableQuantityFactory.createLitre(value);
    }


    public static AddableQuantity createGallon(double value) {
        return AddableQuantityFactory.createGallon(value);
    }

    public static AddableQuantity createKiloGram(double value) {
        return AddableQuantityFactory.createKiloGram(value);
    }

    AddableQuantity(double value, IUnit unit) {
        super(value,unit);
        this.unit=unit;
        this.value=value;
    }

    public static AddableQuantity createGrams(double value) {
        return AddableQuantityFactory.createGrams(value);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit2=" + unit +
                '}';
    }

    public AddableQuantity add(AddableQuantity other) {
        if (!unit.checkBaseUnit(other.unit)) {
            throw new IllegalArgumentException("Illegal Units");
        }
        return new AddableQuantity(unit.convertToBase(this.value) + other.unit.convertToBase(other.value), this.unit.getBaseUnit());
    }
}


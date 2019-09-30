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
        if (Unit.convertToBaseUnit(this.unit)!=Unit.convertToBaseUnit(other.unit)){
            return false;
        }

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
        if ((this.unit == Unit.inch || this.unit == Unit.feet || this.unit == Unit.yard) && (another.unit == Unit.inch || another.unit == Unit.feet || another.unit == Unit.yard)) {
            return new Quantity(unit.convertToBase(this.value) + another.unit.convertToBase(another.value), Unit.inch);
        }
        return new Quantity(unit.convertToBase(this.value) + another.unit.convertToBase(another.value), Unit.litre);
    }
}


package com.bridgelabz.quantity;

class Converter {
    static final double INCH=1.0;
    static final double FEET_TO_INCH=12;
    static final double YARD_TO_INCH=3*12;
    static final double LITRE=1;
    static final double GALLON_TO_LITRE=3.78;
}
public enum Unit {

    inch(Converter.INCH),
    feet(Converter.FEET_TO_INCH, Unit.inch),
    yard(Converter.YARD_TO_INCH, Unit.inch),
    litre(Converter.LITRE),
    gallon(Converter.GALLON_TO_LITRE, Unit.litre);

    private Unit baseUnit;
    private double conversionFactor;


    Unit(double conversionFactor, Unit baseUnit) {
        this.conversionFactor = conversionFactor;
        this.baseUnit = baseUnit;
    }

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
        this.baseUnit = this;
    }

    public double convertToBase(double value) {
        return value * conversionFactor;
    }

    Unit getBaseUnit() {
        return baseUnit;
    }

    boolean checkBaseUnit(Unit unit1) {
        return this.baseUnit.equals(unit1.baseUnit);
    }
}

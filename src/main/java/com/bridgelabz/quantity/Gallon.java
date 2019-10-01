package com.bridgelabz.quantity;

public class Gallon implements IUnit {
    public static final double CONVERT_TO_LITRE=3.78;
    private double value;
    private IUnit unit;

    @Override
    public double convertToBase(double value) {
        return CONVERT_TO_LITRE*value;
    }

    @Override
    public IUnit getBaseUnit() {
        return new Litre();
    }

    @Override
    public boolean checkBaseUnit(IUnit unit2) {
        return this.getBaseUnit().equals(unit2.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        return obj instanceof Volume;
    }
}

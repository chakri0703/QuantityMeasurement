package com.bridgelabz.quantity;

public class Litre implements Volume {

    public static final double CONVERTER=1.0;
    @Override
    public double convertToBase(double value) {
        return value*CONVERTER;
    }

    @Override
    public Volume getBaseUnit() {
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

package com.bridgelabz.quantity.weight;

import com.bridgelabz.quantity.IUnit;

public class KiloGram implements IUnit {
    public static final double CONVERT_TO_GRAMS=1000.0;
    @Override
    public double convertToBase(double value) {
        return value*CONVERT_TO_GRAMS;
    }

    @Override
    public IUnit getBaseUnit() {
        return new Gram();
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
        return obj instanceof IWeight;
    }
}

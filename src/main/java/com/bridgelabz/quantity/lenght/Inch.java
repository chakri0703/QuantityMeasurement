package com.bridgelabz.quantity.lenght;

import com.bridgelabz.quantity.IUnit;

public class Inch implements Length {

    public static final double CONVERT_TO_INCH=1.0;
    private  double value;
    private IUnit unit;
    @Override
    public double convertToBase(double value) {
        return value*CONVERT_TO_INCH;
    }

    @Override
    public Length getBaseUnit() {
        return new Inch();
    }

    @Override
    public boolean checkBaseUnit(IUnit unit2) {
        System.out.println(unit2);
        System.out.println(this);
        return this.getBaseUnit().equals(unit2.getBaseUnit());
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        return obj instanceof Length;
    }
}


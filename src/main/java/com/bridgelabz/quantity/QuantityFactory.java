package com.bridgelabz.quantity;

public class QuantityFactory {

    public static Quantity createInch(double value){
        return new Quantity(value, new Inch());
    }

    public static  Quantity createFoot(double value){
    return  new Quantity(value,new Feet());
    }
    public static  Quantity createYard(double value){
        return new Quantity(value,new Yard());
    }
}

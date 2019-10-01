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

    public static Quantity createLitre(double value){
        return new Quantity( value, new Litre());
    }

    public static Quantity createGallon(double value){
        return new Quantity(value,new Gallon());
    }
}

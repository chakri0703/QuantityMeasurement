package com.bridgelabz.quantity;

import com.bridgelabz.quantity.lenght.Feet;
import com.bridgelabz.quantity.lenght.Inch;
import com.bridgelabz.quantity.lenght.Yard;
import com.bridgelabz.quantity.volume.Gallon;
import com.bridgelabz.quantity.volume.Litre;
import com.bridgelabz.quantity.weight.Gram;
import com.bridgelabz.quantity.weight.KiloGram;

public class AddableQuantityFactory {

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

    public static Quantity createKiloGram(double value) {
        return new Quantity(value,new KiloGram());
    }

    public static Quantity createGrams(double value) {
        return new Quantity(value,new Gram());
    }
}

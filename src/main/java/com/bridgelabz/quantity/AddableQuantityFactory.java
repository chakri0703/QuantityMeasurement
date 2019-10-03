package com.bridgelabz.quantity;

import com.bridgelabz.quantity.lenght.Feet;
import com.bridgelabz.quantity.lenght.Inch;
import com.bridgelabz.quantity.lenght.Yard;
import com.bridgelabz.quantity.volume.Gallon;
import com.bridgelabz.quantity.volume.Litre;
import com.bridgelabz.quantity.weight.Gram;
import com.bridgelabz.quantity.weight.KiloGram;

public class AddableQuantityFactory {

    public static AddableQuantity createInch(double value) {
        return new AddableQuantity(value, new Inch());
    }

    public static AddableQuantity createFoot(double value) {
        return new AddableQuantity(value, new Feet());
    }

    public static AddableQuantity createYard(double value) {
        return new AddableQuantity(value, new Yard());
    }

    public static AddableQuantity createLitre(double value) {
        return new AddableQuantity(value, new Litre());
    }

    public static AddableQuantity createGallon(double value) {
        return new AddableQuantity(value, new Gallon());
    }

    public static AddableQuantity createKiloGram(double value) {
        return new AddableQuantity(value, new KiloGram());
    }

    public static AddableQuantity createGrams(double value) {
        return new AddableQuantity(value, new Gram());
    }
}

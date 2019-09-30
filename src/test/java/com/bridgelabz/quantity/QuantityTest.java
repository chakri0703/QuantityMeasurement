package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroFeetOne=Quantity.createFoot(0.0);
        Quantity zeroFeetTwo =Quantity.createFoot(0.0);;

        assertEquals(zeroFeetOne, zeroFeetTwo);
    }

    @Test
    void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeetOne=Quantity.createFoot(1.0);
        Quantity oneFeetTwo =Quantity.createFoot(1.0);

        assertEquals(oneFeetOne, oneFeetTwo);
    }

    @Test
    void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = Quantity.createFoot(1.0);
        Quantity twoFeetTwo =Quantity.createFoot(2.0);

        assertNotEquals(oneFeetOne, twoFeetTwo);
    }

    @Test
    void givenOneFeetAndString_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = Quantity.createFoot(1.0);
        String dummyString = "TDD";

        assertNotEquals(oneFeetOne, dummyString);
    }

    @Test
    void givenOneFeetAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne =Quantity.createFoot(1.0);
        Quantity nullObject = null;

        assertNotEquals(oneFeetOne, nullObject);
    }

    @Test
    void givenSameObect_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeet = Quantity.createFoot(1);

        assertEquals(oneFeet, oneFeet);
    }


    @Test
    void givenZeroInchAndZeoInch_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInchOne = Quantity.createInch(0.0);
        Quantity zeroInchTwo = Quantity.createInch(0.0);
        assertEquals(zeroInchOne, zeroInchTwo);
    }

    @Test
    void givenOneInchAndOneInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneInchOne = Quantity.createInch(1.0);
        Quantity oneInchTwo = Quantity.createInch(1.0);
        assertEquals(oneInchOne, oneInchTwo);
    }

    @Test
    void givenOneInchAndTwoInch_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = Quantity.createInch(1.0);
        Quantity twoInch = Quantity.createInch(2.0);
        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndString_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = Quantity.createInch(1.0);
        String dummyString = "TDD";
        assertNotEquals(oneInch, dummyString);
    }

    @Test
    void givenOneInchAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch =Quantity.createInch(1.0);
        Quantity nullObject = null;
        assertNotEquals(oneInch, nullObject);
    }

    @Test
    void givenSameInchObejct_WhenCompare_ThenShouldBeEqual() {
        Quantity oneInch = Quantity.createInch(1.0);

        assertEquals(oneInch, oneInch);
    }

    @Test
    void givenOneInchAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch =Quantity.createInch(1.0);
        Quantity oneFeet =  Quantity.createFoot(1.0);

        assertNotEquals(oneInch, oneFeet);
    }

    @Test
    void givenZeroInchAndZeroFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = Quantity.createInch(0.0);
        Quantity zeroFeet =  Quantity.createFoot(0.0);

        assertEquals(zeroInch, zeroFeet);
    }

    @Test
    void givenZeroInchAndOneFeet_WhenCompare_ThenNOtShouldBeEqual() {
        Quantity zeroInch = Quantity.createInch(0.0);
        Quantity oneFeet =  Quantity.createFoot(1.0);

        assertNotEquals(zeroInch, oneFeet);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeet =  Quantity.createFoot(1.0);
        Quantity twelveInch =Quantity.createInch(12.0);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void giventwelveInchAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity twelveInch = Quantity.createInch(12.0);
        Quantity oneFeet =  Quantity.createFoot(1.0);

        assertEquals(twelveInch, oneFeet);
    }

    @Test
    void givenOneYardAndOneYard_WhenCompare_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(1.0, Unit.yard);
        Quantity oneFeet = new Quantity(1.0, Unit.yard);

        assertEquals(twelveInch, oneFeet);
    }

    @Test
    void givenOneYardAndTwoYard_WhenCompare_ThenShouldNotBeEqual() {
        Quantity twoYard = new Quantity(2.0, Unit.yard);
        Quantity oneYard = new Quantity(1.0, Unit.yard);

        assertNotEquals(twoYard, oneYard);
    }

    @Test
    void givenOneYardAndThreeFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity threeFeet =  Quantity.createFoot(3.0);

        assertEquals(oneYard, threeFeet);
    }

    @Test
    void givenOneYardAndThirtySixInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity thirtySixFeet =Quantity.createInch(36.0);

        assertEquals(oneYard, thirtySixFeet);
    }

    @Test
    void givenOneYardAndSixInch_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity sixInch =Quantity.createInch(6.0);

        assertNotEquals(oneYard, sixInch);
    }

    @Test
    void givenOneYardAndSixFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity sixFeet = Quantity.createFoot(6.0);

        assertNotEquals(oneYard, sixFeet);
    }

    @Test
    void givenTwoZeroInch_WhenAdd_ThenShouldAdd() {
        Quantity zeroInch = Quantity.createInch(0.0);
        Quantity anotherZero = Quantity.createInch(0.0);

        assertEquals(Quantity.createInch(0.0), zeroInch.add(anotherZero));
    }

    @Test
    void givenZeroInchAndOneInch_WhenAdd_ThenShouldAdd() {
        Quantity zeroInch = Quantity.createInch(0.0);
        Quantity oneInch =Quantity.createInch(1.0);

        assertEquals(Quantity.createInch(1.0), zeroInch.add(oneInch));
    }

    @Test
    void givenOneInchAndOneInch_WhenAdd_ThenShouldAdd() {
        Quantity zeroInch =  Quantity.createInch(1.0);
        Quantity oneInch = Quantity.createInch(1.0);

        assertEquals( Quantity.createInch(2.0), zeroInch.add(oneInch));
    }

    @Test
    void givenOneFeetAndOneInch_WhenAdd_ThenShouldAdd() {
        Quantity oneInch = Quantity.createInch(1.0);
        Quantity oneFeet =  Quantity.createFoot(1.0);

        assertEquals( Quantity.createInch(13.0), oneFeet.add(oneInch));
    }

    @Test
    void givenOneInchAndOneFeet_WhenAdd_ThenShouldAdd() {
        Quantity oneInch = Quantity.createInch(1.0);
        Quantity oneFeet =  Quantity.createFoot(1);

        assertEquals(Quantity.createInch(13.0), oneInch.add(oneFeet));
    }
    @Test
    void givenOneFeetAndOneFeet_WhenAdd_ThenShouldAdd() {
        Quantity onefeet =  Quantity.createFoot(1.0);
        Quantity oneFeet = Quantity.createFoot(1.0);

        assertEquals( Quantity.createFoot(2.0), onefeet.add(oneFeet));
    }

    @Test
    void givenOneGallonAndOneGallon_WhenCompare_ThenShouldBeEqual() {

        Quantity oneGallon = new Quantity(1, Unit.gallon);
        Quantity anotherOneGallon = new Quantity(1, Unit.gallon);

        assertEquals(oneGallon, anotherOneGallon);
    }
    @Test
    void givenOneLitreAndOneLitre_WhenCompare_ThenShouldBeEqual() {

        Quantity oneLitre = new Quantity(1, Unit.litre);
        Quantity anotherOneLitre = new Quantity(1, Unit.litre);

        assertEquals(oneLitre, anotherOneLitre);
    }
    @Test
    void givenOneGallonAndThreeDotSevenEightLitre_WhenCompare_ThenShouldBeEqual() {

        Quantity oneGallon = new Quantity(1, Unit.gallon);
        Quantity ThreeDotSevenEightLitre = new Quantity(3.78, Unit.litre);

        assertEquals(oneGallon, ThreeDotSevenEightLitre);
    }

    @Test
    void givenOneGallonAndOneGallon_WhenAdd_ThenShouldAdd() {

        Quantity oneGallon = new Quantity(1, Unit.gallon);
        Quantity anotherGallon = new Quantity(1, Unit.gallon);


        assertEquals(new Quantity(2,Unit.gallon),oneGallon.add(anotherGallon));
    }

    @Test
    void givenOneLitreAndOneLitre_WhenAdd_ThenShouldAdd() {

        Quantity oneLitre = new Quantity(1, Unit.litre);
        Quantity anotherLitre = new Quantity(1, Unit.litre);


        assertEquals(new Quantity(2,Unit.litre),oneLitre.add(anotherLitre));
    }

    @Test
    void givenOneLitreAndOneGallon_WhenAdd_ThenShouldAdd() {

        Quantity oneLitre = new Quantity(1, Unit.litre);
        Quantity oneGallon = new Quantity(1, Unit.gallon);


        assertEquals(new Quantity(4.78,Unit.litre),oneLitre.add(oneGallon));
    }


}

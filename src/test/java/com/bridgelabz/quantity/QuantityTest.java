package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroFeetOne=Quantity.createFoot(0);
        Quantity zeroFeetTwo = new Quantity(0.0, Unit.feet);

        assertEquals(zeroFeetOne, zeroFeetTwo);
    }

    @Test
    void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeetOne=Quantity.createFoot(1);
        Quantity oneFeetTwo =Quantity.createFoot(1);

        assertEquals(oneFeetOne, oneFeetTwo);
    }

    @Test
    void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = Quantity.createFoot(1);
        Quantity twoFeetTwo =Quantity.createFoot(2);

        assertNotEquals(oneFeetOne, twoFeetTwo);
    }

    @Test
    void givenOneFeetAndString_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = new Quantity(1.0, Unit.feet);
        String dummyString = "TDD";

        assertNotEquals(oneFeetOne, dummyString);
    }

    @Test
    void givenOneFeetAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneFeetOne = new Quantity(1.0, Unit.feet);
        Quantity nullObject = null;

        assertNotEquals(oneFeetOne, nullObject);
    }

    @Test
    void givenSameObect_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeet = new Quantity(1.0, Unit.feet);

        assertEquals(oneFeet, oneFeet);
    }


    @Test
    void givenZeroInchAndZeoInch_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInchOne = new Quantity(0.0, Unit.inch);
        Quantity zeroInchTwo = new Quantity(0.0, Unit.inch);
        assertEquals(zeroInchOne, zeroInchTwo);
    }

    @Test
    void givenOneInchAndOneInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneInchOne = new Quantity(1.0, Unit.inch);
        Quantity oneInchTwo = new Quantity(1.0, Unit.inch);
        assertEquals(oneInchOne, oneInchTwo);
    }

    @Test
    void givenOneInchAndTwoInch_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1.0, Unit.inch);
        Quantity twoInch = new Quantity(2.0, Unit.inch);
        assertNotEquals(oneInch, twoInch);
    }

    @Test
    void givenOneInchAndString_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1.0, Unit.inch);
        String dummyString = "TDD";
        assertNotEquals(oneInch, dummyString);
    }

    @Test
    void givenOneInchAndNull_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1.0, Unit.inch);
        Quantity nullObject = null;
        assertNotEquals(oneInch, nullObject);
    }

    @Test
    void givenSameInchObejct_WhenCompare_ThenShouldBeEqual() {
        Quantity oneInch = new Quantity(1.0, Unit.inch);

        assertEquals(oneInch, oneInch);
    }

    @Test
    void givenOneInchAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1.0, Unit.inch);
        Quantity oneFeet = new Quantity(1.0, Unit.feet);

        assertNotEquals(oneInch, oneFeet);
    }

    @Test
    void givenZeroInchAndZeroFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0.0, Unit.inch);
        Quantity zeroFeet = new Quantity(0.0, Unit.feet);

        assertEquals(zeroInch, zeroFeet);
    }

    @Test
    void givenZeroInchAndOneFeet_WhenCompare_ThenNOtShouldBeEqual() {
        Quantity zeroInch = new Quantity(0.0, Unit.inch);
        Quantity oneFeet = new Quantity(1.0, Unit.feet);

        assertNotEquals(zeroInch, oneFeet);
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneFeet = new Quantity(1.0, Unit.feet);
        Quantity twelveInch = new Quantity(12.0, Unit.inch);

        assertEquals(oneFeet, twelveInch);
    }

    @Test
    void giventwelveInchAndOneFeet_WhenCompare_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12.0, Unit.inch);
        Quantity oneFeet = new Quantity(1.0, Unit.feet);

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
        Quantity threeFeet = new Quantity(3.0, Unit.feet);

        assertEquals(oneYard, threeFeet);
    }

    @Test
    void givenOneYardAndThirtySixInch_WhenCompare_ThenShouldBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity thirtySixFeet = new Quantity(36.0, Unit.inch);

        assertEquals(oneYard, thirtySixFeet);
    }

    @Test
    void givenOneYardAndSixInch_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity sixInch = new Quantity(6.0, Unit.inch);

        assertNotEquals(oneYard, sixInch);
    }

    @Test
    void givenOneYardAndSixFeet_WhenCompare_ThenShouldNotBeEqual() {
        Quantity oneYard = new Quantity(1.0, Unit.yard);
        Quantity sixFeet = new Quantity(6.0, Unit.feet);

        assertNotEquals(oneYard, sixFeet);
    }

    @Test
    void givenTwoZeroInch_WhenAdd_ThenShouldAdd() {
        Quantity zeroInch = new Quantity(0, Unit.inch);
        Quantity anotherZero = new Quantity(0, Unit.inch);

        assertEquals(new Quantity(0.0, Unit.inch), zeroInch.add(anotherZero));
    }

    @Test
    void givenZeroInchAndOneInch_WhenAdd_ThenShouldAdd() {
        Quantity zeroInch = new Quantity(0, Unit.inch);
        Quantity oneInch = new Quantity(1, Unit.inch);

        assertEquals(new Quantity(1.0, Unit.inch), zeroInch.add(oneInch));
    }

    @Test
    void givenOneInchAndOneInch_WhenAdd_ThenShouldAdd() {
        Quantity zeroInch = new Quantity(1, Unit.inch);
        Quantity oneInch = new Quantity(1, Unit.inch);

        assertEquals(new Quantity(2.0, Unit.inch), zeroInch.add(oneInch));
    }

    @Test
    void givenOneFeetAndOneInch_WhenAdd_ThenShouldAdd() {
        Quantity oneInch = new Quantity(1, Unit.inch);
        Quantity oneFeet = new Quantity(1, Unit.feet);

        assertEquals(new Quantity(13.0, Unit.inch), oneFeet.add(oneInch));
    }

    @Test
    void givenOneInchAndOneFeet_WhenAdd_ThenShouldAdd() {
        Quantity oneInch = new Quantity(1, Unit.inch);
        Quantity oneFeet = new Quantity(1, Unit.feet);

        assertEquals(new Quantity(13.0, Unit.inch), oneInch.add(oneFeet));
    }
    @Test
    void givenOneFeetAndOneFeet_WhenAdd_ThenShouldAdd() {
        Quantity onefeet = new Quantity(1, Unit.feet);
        Quantity oneFeet = new Quantity(1, Unit.feet);

        assertEquals(new Quantity(2.0, Unit.feet), onefeet.add(oneFeet));
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

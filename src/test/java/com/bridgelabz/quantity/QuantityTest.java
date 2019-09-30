package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.bridgelabz.quantity.Quantity.*;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Nested
    class FeetTest {

        @Test
        void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {
            Quantity zeroFeetOne = createFoot(0.0);
            Quantity zeroFeetTwo = createFoot(0.0);

            assertEquals(zeroFeetOne, zeroFeetTwo);
        }

        @Test
        void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
            Quantity oneFeetOne = createFoot(1.0);
            Quantity oneFeetTwo = createFoot(1.0);

            assertEquals(oneFeetOne, oneFeetTwo);
        }

        @Test
        void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
            Quantity oneFeetOne = createFoot(1.0);
            Quantity twoFeetTwo = createFoot(2.0);

            assertNotEquals(oneFeetOne, twoFeetTwo);
        }

        @Test
        void givenOneFeetAndString_WhenCompare_ThenShouldNotBeEqual() {
            Quantity oneFeetOne = createFoot(1.0);
            String dummyString = "TDD";

            assertNotEquals(oneFeetOne, dummyString);
        }

        @Test
        void givenOneFeetAndNull_WhenCompare_ThenShouldNotBeEqual() {
            Quantity oneFeetOne = createFoot(1.0);
            Quantity nullObject = null;

            assertNotEquals(oneFeetOne, nullObject);
        }

        @Test
        void givenSameObect_WhenCompare_ThenShouldBeEqual() {
            Quantity oneFeet = createFoot(1);

            assertEquals(oneFeet, oneFeet);
        }
    }


    @Nested
    class InchTest {

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
            Quantity oneInch = Quantity.createInch(1.0);
            Quantity nullObject = null;
            assertNotEquals(oneInch, nullObject);
        }

        @Test
        void givenSameInchObejct_WhenCompare_ThenShouldBeEqual() {
            Quantity oneInch = Quantity.createInch(1.0);

            assertEquals(oneInch, oneInch);
        }
    }


    @Nested
    class InchFeetEqualityTest {
        @Test
        void givenOneInchAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
            Quantity oneInch = Quantity.createInch(1.0);
            Quantity oneFeet = createFoot(1.0);

            assertNotEquals(oneInch, oneFeet);
        }

        @Test
        void givenZeroInchAndZeroFeet_WhenCompare_ThenShouldBeEqual() {
            Quantity zeroInch = Quantity.createInch(0.0);
            Quantity zeroFeet = createFoot(0.0);

            assertEquals(zeroInch, zeroFeet);
        }

        @Test
        void givenZeroInchAndOneFeet_WhenCompare_ThenNOtShouldBeEqual() {
            Quantity zeroInch = Quantity.createInch(0.0);
            Quantity oneFeet = createFoot(1.0);

            assertNotEquals(zeroInch, oneFeet);
        }

        @Test
        void givenOneFeetAndTwelveInch_WhenCompare_ThenShouldBeEqual() {
            Quantity oneFeet = createFoot(1.0);
            Quantity twelveInch = Quantity.createInch(12.0);

            assertEquals(oneFeet, twelveInch);
        }

        @Test
        void giventwelveInchAndOneFeet_WhenCompare_ThenShouldBeEqual() {
            Quantity twelveInch = Quantity.createInch(12.0);
            Quantity oneFeet = createFoot(1.0);

            assertEquals(twelveInch, oneFeet);
        }
    }

    @Nested
    class YardTest {
        @Test
        void givenOneYardAndOneYard_WhenCompare_ThenShouldBeEqual() {
            Quantity twelveInch = Quantity.createYard(1.0);
            Quantity oneFeet = Quantity.createYard(1.0);

            assertEquals(twelveInch, oneFeet);
        }

        @Test
        void givenOneYardAndTwoYard_WhenCompare_ThenShouldNotBeEqual() {
            Quantity twoYard = Quantity.createYard(2.0);
            Quantity oneYard = Quantity.createYard(1.0);

            assertNotEquals(twoYard, oneYard);
        }
    }

    @Nested
    class YardFeetEqualityTest {
        @Test
        void givenOneYardAndThreeFeet_WhenCompare_ThenShouldBeEqual() {
            Quantity oneYard = Quantity.createYard(1.0);
            Quantity threeFeet = createFoot(3.0);

            assertEquals(oneYard, threeFeet);
        }

        @Test
        void givenOneYardAndSixFeet_WhenCompare_ThenShouldNotBeEqual() {
            Quantity oneYard = Quantity.createYard(1.0);
            Quantity sixFeet = createFoot(6.0);

            assertNotEquals(oneYard, sixFeet);
        }
    }

    @Nested
    class YardInchEqualityTest {
        @Test
        void givenOneYardAndThirtySixInch_WhenCompare_ThenShouldBeEqual() {
            Quantity oneYard = Quantity.createYard(1.0);
            Quantity thirtySixFeet = Quantity.createInch(36.0);

            assertEquals(oneYard, thirtySixFeet);
        }

        @Test
        void givenOneYardAndSixInch_WhenCompare_ThenShouldNotBeEqual() {
            Quantity oneYard = Quantity.createYard(1.0);
            Quantity sixInch = Quantity.createInch(6.0);

            assertNotEquals(oneYard, sixInch);
        }

        @Test
        void givenTwoZeroInch_WhenAdd_ThenShouldAdd() {
            Quantity zeroInch = Quantity.createInch(0.0);
            Quantity anotherZero = Quantity.createInch(0.0);

            assertEquals(Quantity.createInch(0.0), zeroInch.add(anotherZero));
        }
    }


    @Nested
    class InchAddTEest {

        @Test
        void givenZeroInchAndOneInch_WhenAdd_ThenShouldAdd() {
            Quantity zeroInch = Quantity.createInch(0.0);
            Quantity oneInch = Quantity.createInch(1.0);

            assertEquals(Quantity.createInch(1.0), zeroInch.add(oneInch));
        }

        @Test
        void givenOneInchAndOneInch_WhenAdd_ThenShouldAdd() {
            Quantity zeroInch = Quantity.createInch(1.0);
            Quantity oneInch = Quantity.createInch(1.0);

            assertEquals(Quantity.createInch(2.0), zeroInch.add(oneInch));
        }
    }


    @Nested
    class AddInchAndFeetTest {
        @Test
        void givenOneFeetAndOneInch_WhenAdd_ThenShouldAdd() {
            Quantity oneInch = Quantity.createInch(1.0);
            Quantity oneFeet = createFoot(1.0);

            assertEquals(Quantity.createInch(13.0), oneFeet.add(oneInch));
        }

        @Test
        void givenOneInchAndOneFeet_WhenAdd_ThenShouldAdd() {
            Quantity oneInch = Quantity.createInch(1.0);
            Quantity oneFeet = createFoot(1);

            assertEquals(Quantity.createInch(13.0), oneInch.add(oneFeet));
        }
    }

    @Nested
    class FeetAddTest {
        @Test
        void givenOneFeetAndOneFeet_WhenAdd_ThenShouldAdd() {
            Quantity onefeet = createFoot(1.0);
            Quantity oneFeet = createFoot(1.0);

            assertEquals(createFoot(2.0), onefeet.add(oneFeet));
        }

    }

    @Nested
    class GallonTest {
        @Test
        void givenOneGallonAndOneGallon_WhenCompare_ThenShouldBeEqual() {

            Quantity oneGallon = createGallon(1.0);
            Quantity anotherOneGallon = createGallon(1.0);

            assertEquals(oneGallon, anotherOneGallon);
        }
    }

    @Nested
    class LitreTest {
        @Test
        void givenOneLitreAndOneLitre_WhenCompare_ThenShouldBeEqual() {

            Quantity oneLitre = Quantity.createLitre(1.0);
            Quantity anotherOneLitre = Quantity.createLitre(1.0);

            assertEquals(oneLitre, anotherOneLitre);
        }
    }

    @Nested
    class LitreAndGallonEqualityTest {
        @Test
        void givenOneGallonAndThreeDotSevenEightLitre_WhenCompare_ThenShouldBeEqual() {

            Quantity oneGallon = createGallon(1.0);
            Quantity ThreeDotSevenEightLitre = Quantity.createLitre(3.78);

            assertEquals(oneGallon, ThreeDotSevenEightLitre);
        }

        @Test
        void givenOneGallonAndOneGallon_WhenAdd_ThenShouldAdd() {

            Quantity oneGallon = createGallon(1.0);
            Quantity anotherGallon = createGallon(1.0);


            assertEquals(createGallon(2.0), oneGallon.add(anotherGallon));
        }


    }

    @Nested
    class LitreGallonAddTest {
        @Test
        void givenOneLitreAndOneLitre_WhenAdd_ThenShouldAdd() {

            Quantity oneLitre = Quantity.createLitre(1.0);
            Quantity anotherLitre = Quantity.createLitre(1.0);


            assertEquals(Quantity.createLitre(2.0), oneLitre.add(anotherLitre));
        }

        @Test
        void givenOneLitreAndOneGallon_WhenAdd_ThenShouldAdd() {

            Quantity oneLitre = Quantity.createLitre(1.0);
            Quantity oneGallon = createGallon(1.0);


            assertEquals(Quantity.createLitre(4.78), oneLitre.add(oneGallon));
        }
    }

    @Nested
    class EqualityTestVolumeAndLength {
        @Test
        void givenOneGallonAndOneFeet_WhenCompare_ThenShouldTheyAreNotEqual() {
            Quantity oneFeet = createFoot(1.0);
            Quantity oneGallon = createGallon(1.0);

            assertNotEquals(oneFeet, oneGallon);
        }

        @Test
        void givenOneFeetAndOneLitre_WhenCompare_ThenShouldTheyAreNOtEqual(){
            Quantity oneInch=createInch(1.0);
            Quantity oneLitre=createLitre(1.0);

            assertNotEquals(oneInch,oneLitre);
        }

        @Test
        void givenOneInchAndOneGallonThenShouldNotEqual(){
            Quantity oneInch=createInch(1.0);
            Quantity oneGallon=createGallon(1.0);

            assertNotEquals(oneGallon,oneInch);
        }
    }

    @Nested
    class AddGallonAndFeet {

        private Quantity IllegalAccessException;

//        @Test
//        void givenOneGallonAndOneFeet_whenAdd_ThenShouldThrowException() {
//
//            assertThrows(IllegalAccessException.class, () -> {
//                createFoot(1.0).add(createGallon(1.0));
//            });
//        }
    }

}

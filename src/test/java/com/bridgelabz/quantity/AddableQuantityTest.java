package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.bridgelabz.quantity.AddableQuantity.*;
import static org.junit.jupiter.api.Assertions.*;

public class AddableQuantityTest {

    @Nested
    class FeetTest {

        @Test
        void givenZeroFeetAndZeoFeet_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity zeroFeetOne = createFoot(0.0);
            AddableQuantity zeroFeetTwo = createFoot(0.0);

            assertEquals(zeroFeetOne, zeroFeetTwo);
        }

        @Test
        void givenOneFeetAndOneFeet_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity oneFeetOne = createFoot(1.0);
            AddableQuantity oneFeetTwo = createFoot(1.0);

            assertEquals(oneFeetOne, oneFeetTwo);
        }

        @Test
        void givenTwoFeetAndTwoFeet_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneFeetOne = createFoot(1.0);
            AddableQuantity twoFeetTwo = createFoot(2.0);

            assertNotEquals(oneFeetOne, twoFeetTwo);
        }

        @Test
        void givenOneFeetAndString_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneFeetOne = createFoot(1.0);
            String dummyString = "TDD";

            assertNotEquals(oneFeetOne, dummyString);
        }

        @Test
        void givenOneFeetAndNull_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneFeetOne = createFoot(1.0);
            AddableQuantity nullObject = null;

            assertNotEquals(oneFeetOne, nullObject);
        }

        @Test
        void givenSameObject_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity oneFeet = createFoot(1);

            assertEquals(oneFeet, oneFeet);
        }
    }

    @Nested
    class InchTest {

        @Test
        void givenZeroInchAndZeoInch_WhenEquals_ThenShouldBeEqual() {
            AddableQuantity zeroInchOne = createInch(0.0);
            AddableQuantity zeroInchTwo = createInch(0.0);
            assertEquals(zeroInchOne, zeroInchTwo);
        }

        @Test
        void givenOneInchAndOneInch_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity oneInchOne = createInch(1.0);
            AddableQuantity oneInchTwo = createInch(1.0);
            assertEquals(oneInchOne, oneInchTwo);
        }

        @Test
        void givenOneInchAndTwoInch_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity twoInch = createInch(2.0);
            assertNotEquals(oneInch, twoInch);
        }

        @Test
        void givenOneInchAndString_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneInch = createInch(1.0);
            String dummyString = "TDD";
            assertNotEquals(oneInch, dummyString);
        }

        @Test
        void givenOneInchAndNull_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity nullObject = null;
            assertNotEquals(oneInch, nullObject);
        }

        @Test
        void givenSameInchObejct_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity oneInch = createInch(1.0);

            assertEquals(oneInch, oneInch);
        }
    }

    @Nested
    class InchFeetEqualityTest {
        @Test
        void givenOneInchAndOneFeet_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity oneFeet = createFoot(1.0);

            assertNotEquals(oneInch, oneFeet);
        }

        @Test
        void givenZeroInchAndZeroFeet_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity zeroInch = createInch(0.0);
            AddableQuantity zeroFeet = createFoot(0.0);

            assertEquals(zeroInch, zeroFeet);
        }

        @Test
        void givenZeroInchAndOneFeet_WhenCompare_ThenNOtShouldBeEqual() {
            AddableQuantity zeroInch = createInch(0.0);
            AddableQuantity oneFeet = createFoot(1.0);

            assertNotEquals(zeroInch, oneFeet);
        }

        @Test
        void givenOneFeetAndTwelveInch_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity oneFeet = createFoot(1.0);
            AddableQuantity twelveInch = createInch(12.0);

            assertEquals(oneFeet, twelveInch);
        }

        @Test
        void giventwelveInchAndOneFeet_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity twelveInch = createInch(12.0);
            AddableQuantity oneFeet = createFoot(1.0);

            assertEquals(twelveInch, oneFeet);
        }
    }

    @Nested
    class YardTest {
        @Test
        void givenOneYardAndOneYard_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity twelveInch = createYard(1.0);
            AddableQuantity oneFeet = createYard(1.0);

            assertEquals(twelveInch, oneFeet);
        }

        @Test
        void givenOneYardAndTwoYard_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity twoYard = createYard(2.0);
            AddableQuantity oneYard = createYard(1.0);

            assertNotEquals(twoYard, oneYard);
        }
    }

    @Nested
    class YardFeetEqualityTest {
        @Test
        void givenOneYardAndThreeFeet_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity oneYard = createYard(1.0);
            AddableQuantity threeFeet = createFoot(3.0);

            assertEquals(oneYard, threeFeet);
        }

        @Test
        void givenOneYardAndSixFeet_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneYard = createYard(1.0);
            AddableQuantity sixFeet = createFoot(6.0);

            assertNotEquals(oneYard, sixFeet);
        }
    }

    @Nested
    class YardInchEqualityTest {
        @Test
        void givenOneYardAndThirtySixInch_WhenCompare_ThenShouldBeEqual() {
            AddableQuantity oneYard = createYard(1.0);
            AddableQuantity thirtySixFeet = createInch(36.0);

            assertEquals(oneYard, thirtySixFeet);
        }

        @Test
        void givenOneYardAndSixInch_WhenCompare_ThenShouldNotBeEqual() {
            AddableQuantity oneYard = createYard(1.0);
            AddableQuantity sixInch = createInch(6.0);

            assertNotEquals(oneYard, sixInch);
        }

        @Test
        void givenTwoZeroInch_WhenAdd_ThenShouldAdd() {
            AddableQuantity zeroInch = createInch(0.0);
            AddableQuantity anotherZero = createInch(0.0);

            assertEquals(createInch(0.0), zeroInch.add(anotherZero));
        }
    }

    @Nested
    class InchAddTEest {

        @Test
        void givenZeroInchAndOneInch_WhenAdd_ThenShouldAdd() {
            AddableQuantity zeroInch = createInch(0.0);
            AddableQuantity oneInch = createInch(1.0);

            assertEquals(createInch(1.0), zeroInch.add(oneInch));
        }

        @Test
        void givenOneInchAndOneInch_WhenAdd_ThenShouldAdd() {
            AddableQuantity zeroInch = createInch(1.0);
            AddableQuantity oneInch = createInch(1.0);

            assertEquals(createInch(2.0), zeroInch.add(oneInch));
        }
    }

    @Nested
    class AddInchAndFeetTest {
        @Test
        void givenOneFeetAndOneInch_WhenAdd_ThenShouldAdd() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity oneFeet = createFoot(1.0);

            assertEquals(createInch(13.0), oneFeet.add(oneInch));
        }

        @Test
        void givenOneInchAndOneFeet_WhenAdd_ThenShouldAdd() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity oneFeet = createFoot(1);

            assertEquals(createInch(13.0), oneInch.add(oneFeet));
        }
    }

    @Nested
    class FeetAddTest {
        @Test
        void givenOneFeetAndOneFeet_WhenAdd_ThenShouldAdd() {
            AddableQuantity onefeet = createFoot(1.0);
            AddableQuantity oneFeet = createFoot(1.0);

            assertEquals(createFoot(2.0), onefeet.add(oneFeet));
        }

    }

    @Nested
    class GallonTest {
        @Test
        void givenOneGallonAndOneGallon_WhenCompare_ThenShouldBeEqual() {

            AddableQuantity oneGallon = createGallon(1.0);
            AddableQuantity anotherOneGallon = createGallon(1.0);

            assertEquals(oneGallon, anotherOneGallon);
        }
    }

    @Nested
    class LitreTest {
        @Test
        void givenOneLitreAndOneLitre_WhenCompare_ThenShouldBeEqual() {

            AddableQuantity oneLitre = createLitre(1.0);
            AddableQuantity anotherOneLitre = createLitre(1.0);

            assertEquals(oneLitre, anotherOneLitre);
        }
    }

    @Nested
    class LitreAndGallonEqualityTest {
        @Test
        void givenOneGallonAndThreeDotSevenEightLitre_WhenCompare_ThenShouldBeEqual() {

            AddableQuantity oneGallon = createGallon(1.0);
            AddableQuantity ThreeDotSevenEightLitre = createLitre(3.78);

            assertEquals(oneGallon, ThreeDotSevenEightLitre);
        }

        @Test
        void givenOneGallonAndOneGallon_WhenAdd_ThenShouldAdd() {

            AddableQuantity oneGallon = createGallon(1.0);
            AddableQuantity anotherGallon = createGallon(1.0);


            assertEquals(createGallon(2.0), oneGallon.add(anotherGallon));
        }


    }

    @Nested
    class LitreGallonAddTest {
        @Test
        void givenOneLitreAndOneLitre_WhenAdd_ThenShouldAdd() {

            AddableQuantity oneLitre = createLitre(1.0);
            AddableQuantity anotherLitre = createLitre(1.0);


            assertEquals(createLitre(2.0), oneLitre.add(anotherLitre));
        }

        @Test
        void givenOneLitreAndOneGallon_WhenAdd_ThenShouldAdd() {

            AddableQuantity oneLitre = createLitre(1.0);
            AddableQuantity oneGallon = createGallon(1.0);


            assertEquals(createLitre(4.78), oneLitre.add(oneGallon));
        }
    }

    @Nested
    class VolumeAndLengthEqualityTest {
        @Test
        void givenOneGallonAndOneFeet_WhenCompare_ThenShouldTheyAreNotEqual() {
            AddableQuantity oneFeet = createFoot(1.0);
            AddableQuantity oneGallon = createGallon(1.0);

            assertNotEquals(oneFeet, oneGallon);
        }

        @Test
        void givenOneInchAndOneLitre_WhenCompare_ThenShouldTheyAreNOtEqual() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity oneLitre = createLitre(1.0);

            assertNotEquals(oneInch, oneLitre);
        }

        @Test
        void givenOneInchAndOneGallon_whenCompare_ThenShouldNotEqual() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity oneGallon = createGallon(1.0);

            assertNotEquals(oneGallon, oneInch);
        }

        @Test
        void givenOneGallonAndOneInch_whenCompare_ThenShouldTheyNotEqual() {
            AddableQuantity oneGallon = createGallon(1.0);
            AddableQuantity oneInch = createInch(1.0);

            assertNotEquals(oneGallon, oneInch);
        }

        @Test
        void givenOneLitreAndOneInch_WhenCompare_ThenShouldTheyNotEqual() {

            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity oneLitre = createLitre(1.0);

            assertNotEquals(oneLitre, oneInch);
        }
    }

    @Nested
    class VolumeAndLengthAddTest {

        @Test
        void givenOneFeetAndOneLitre_WhenAdd_ThenShouldThrowException() {
            AddableQuantity oneFeet = createFoot(1.0);
            AddableQuantity oneLitre = createLitre(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneFeet.add(oneLitre);
            });
        }

        @Test
        void givenOneInchAndOneLitre_WhenAdd_ThenSouldTrowException() {
            AddableQuantity oneInch = createInch(1.0);
            AddableQuantity oneLitre = createLitre(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneInch.add(oneLitre);
            });
        }
    }

    @Nested
    class KiloGramTest {

        @Test
        void givenZeroKgAndZeroKg_WhenCompare_ThenTheyShouldBeEqual() {
            AddableQuantity zeroKg = createKiloGram(0.0);
            AddableQuantity anotherZero = createKiloGram(0.0);

            assertEquals(zeroKg, anotherZero);
        }

        @Test
        void givenOneKgAndOneKg_WhenCompare_ThenTheyShouldBeEqual() {
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity anotherOneKg = createKiloGram(1.0);

            assertEquals(oneKg, anotherOneKg);
        }

        @Test
        void givenOneKgAndNull_WhenCompare_ThenTheyShouldNotEqual() {
            AddableQuantity oneKg = createKiloGram(1.0);

            assertNotEquals(oneKg, null);
        }
    }

    @Nested
    class GramTest {

        @Test
        void givenZeroAndZeroGrams_WhenCompared_ThenTheyShouldBeEqual() {
            AddableQuantity zeroGram = createGrams(0.0);
            AddableQuantity anotherGrams = createGrams(0.0);

            assertEquals(zeroGram, anotherGrams);
        }

        @Test
        void givenOneAndOneGram_WhenCompared_ThenTheyShouldBeEqual() {
            AddableQuantity oneGram = createGrams(1.0);
            AddableQuantity anotherOneGram = createGrams(1.0);

            assertEquals(oneGram, anotherOneGram);
        }

        @Test
        void givenOneGramAndNull_WhenCompared_ThenTheyShouldBeEqual() {
            AddableQuantity oneGram = createGrams(1.0);

            assertNotEquals(oneGram, null);
        }
    }

    @Nested
    class AddingKiloGrams {
        @Test
        void givenZeroAndZeroKgs_WhenAdd_TheyShouldAdd() {
            AddableQuantity zeroKg = createKiloGram(0.0);
            AddableQuantity anotherKg = createKiloGram(0.0);

            assertEquals(zeroKg, zeroKg.add(anotherKg));
        }

        @Test
        void givenOneKgAndZeroKg_WhenAdd_ThenShouldAdd() {
            AddableQuantity zeroKg = createKiloGram(0.0);
            AddableQuantity oneKg = createKiloGram(1.0);

            assertEquals(oneKg, oneKg.add(zeroKg));
        }

        @Test
        void givenOneKgAndOneKg_WhenAdd_ThenShouldAdd() {
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity anotherOneKg = createKiloGram(1.0);
            AddableQuantity twoKg = createKiloGram(2.0);
        }
    }

    @Nested
    class AddingKgWithOtherQuantity {

        @Test
        void givenOneKgAndOneInch_WhenAdd_ThenShouldThrowException() {
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity oneInch = createInch(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneKg.add(oneInch);
            });
        }

        @Test
        void givenOneKgAndOneFeet_WhenAdd_ThenShouldThrowException() {
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity oneFeet = createFoot(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneKg.add(oneFeet);
            });
        }

        @Test
        void givenOneKgAndOneYard_WhenAdd_ThenShouldThrowException() {
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity oneYard = createYard(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneKg.add(oneYard);
            });
        }

        @Test
        void givenOneKgAndOneLitre_WhenAdd_ThenShouldThrowException() {
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity oneLitre = createLitre(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneKg.add(oneLitre);
            });
        }
    }

    @Nested
    class AddingGrams {

        @Test
        void givenZeroGramAndZeroGram_WhenAdd_ThenTheyShouldAdd() {
            AddableQuantity zeroGram = createGrams(0.0);
            AddableQuantity anotherZeroGram = createGrams(0.0);

            assertEquals(zeroGram, zeroGram.add(anotherZeroGram));
        }

        @Test
        void givenZeroGramAndOneGram_WhenAdd_ThenShouldAdd() {
            AddableQuantity zeroGram = createGrams(0.0);
            AddableQuantity oneGram = createGrams(1.0);

            assertEquals(oneGram, oneGram.add(zeroGram));
        }

        @Test
        void givenOneGramAndOneGram_WhenAdd_ThenShouldAdd() {
            AddableQuantity oneGram = createGrams(1.0);
            AddableQuantity anotherOneGram = createGrams(1.0);
            AddableQuantity twoGrams = createGrams(2.0);

            assertEquals(twoGrams, oneGram.add(anotherOneGram));
        }
    }

    @Nested
    class AddingKgAndGrams {

        @Test
        void givenZeroAndZeroGrams_WhenAdd_ThenTheyShouldAdd() {
            AddableQuantity zeroGram = createGrams(0.0);
            AddableQuantity zeroKg = createKiloGram(0.0);

            assertEquals(zeroGram, zeroGram.add(zeroKg));
        }

        @Test
        void givenOneGramAndZeroKg_WhenAdd_ThenTheyShouldAdd() {
            AddableQuantity oneGram = createGrams(1.0);
            AddableQuantity zeroKg = createKiloGram(0.0);

            assertEquals(oneGram, oneGram.add(zeroKg));
        }

        @Test
        void givenOneGramAndOneKg_WhenAdd_ThenTheyShouldAdd() {
            AddableQuantity oneGram = createGrams(1.0);
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity sum = createGrams(1001.0);

            assertEquals(sum, oneGram.add(oneKg));
        }

        @Test
        void givenOneKgAndFiveHundredGrams_WhenAdd_ThenTheyShouldAdd() {
            AddableQuantity fiveHundredGrams = createGrams(500.0);
            AddableQuantity oneKg = createKiloGram(1.0);
            AddableQuantity sum = createGrams(1500.0);

            assertEquals(sum, oneKg.add(fiveHundredGrams));

        }
    }

    @Nested
    class AddingGramsWithOtherQuantity {

        @Test
        void givenOneGramAndOneLitre_WhenAdd_ThenShouldThrowException() {
            AddableQuantity oneGram = createGrams(1.0);
            AddableQuantity oneLitre = createLitre(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneGram.add(oneLitre);
            });
        }

        @Test
        void givenOneGramAndOneInch_WhenAdd_ThenShouldThrowException() {
            AddableQuantity oneGram = createGrams(1.0);
            AddableQuantity oneInch = createInch(1.0);

            assertThrows(IllegalArgumentException.class, () -> {
                oneGram.add(oneInch);
            });
        }
    }


}

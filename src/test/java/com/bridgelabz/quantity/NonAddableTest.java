package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static com.bridgelabz.quantity.NonAddableQuanatity.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NonAddableTest {

    @Nested
    static
    class TestingCelsius {
        @Test
        void givenZeroAndZeroCelsius_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuanatity zeroCelsius = createCelsius(0.0);
            NonAddableQuanatity anotherCelsius = createCelsius(0.0);

            assertEquals(zeroCelsius, anotherCelsius);
        }

        @Test
        void givenOneAndOneCelsius_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuanatity oneCelsius = createCelsius(1.0);
            NonAddableQuanatity anotherCelsius = createCelsius(1.0);

            assertEquals(oneCelsius, anotherCelsius);
        }

        @Test
        void givenOneAndZeroCelsius_WhenCompare_ThyenTheyShouldBeNotEqual() {
            NonAddableQuanatity oneCelsius = createCelsius(1.0);
            NonAddableQuanatity zeroCelsius = createCelsius(0.0);

            assertNotEquals(oneCelsius, zeroCelsius);
        }

        @Test
        void givenOneAndTwoCelsius_WhenCompare_ThenTheyShouldBeNotEqaul() {
            NonAddableQuanatity oneCelsius = createCelsius(1.0);
            NonAddableQuanatity twoCelsius = createCelsius(2.0);

            assertNotEquals(oneCelsius, twoCelsius);
        }
    }

    @Nested
    class FahrenheitTest {

        @Test
        void givenZeroFahrenheitAndZeroFahrenheit_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuanatity zeroFahren = createFahrenheit(0.0);
            NonAddableQuanatity anotherZero = createFahrenheit(0.0);

            assertEquals(zeroFahren, anotherZero);
        }

        @Test
        void givenOneFahrenAndOneFahren_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuanatity oneFahren = createFahrenheit(1.0);
            NonAddableQuanatity anotherFahren = createFahrenheit(1.0);

            assertEquals(oneFahren, anotherFahren);
        }

        @Test
        void givenOneFahrenAndZeroFahren_WhenCompare_ThenTheyShouldBeNotEqual() {
            NonAddableQuanatity oneFahren = createFahrenheit(1.0);
            NonAddableQuanatity zeroFahren = createFahrenheit(0.0);

            assertNotEquals(oneFahren, zeroFahren);
        }
    }

    @Nested
    class ComparingCelsiusAndFahrenheit {
        @Test
        void given32FahrenheitAndZeroCelsius_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuanatity thirtyTwoFahrenheit = createFahrenheit(32.0);
            NonAddableQuanatity zeroCelsius = createCelsius(0.0);

            assertEquals(thirtyTwoFahrenheit, zeroCelsius);
        }

        @Test
        void givenOneCelsiusAndThirtythreedotEight_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuanatity thirtyThreeDotEight = createFahrenheit(33.8);
            NonAddableQuanatity oneCelsius = createCelsius(1.0);

            assertEquals(thirtyThreeDotEight, oneCelsius);
        }

        @Test
        void givenZeroCelsiusAndZeroFahrenheit_WhenCompare_ThenTheyShouldBeNotEqual() {
            NonAddableQuanatity zeroCelsius = createCelsius(0.0);
            NonAddableQuanatity zeroFahren = createFahrenheit(0.0);

            assertNotEquals(zeroCelsius, zeroFahren);
        }
    }
}

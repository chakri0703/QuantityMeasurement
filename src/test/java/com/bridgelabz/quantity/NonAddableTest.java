package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.awt.image.CropImageFilter;

import static com.bridgelabz.quantity.NonAddableQuality.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NonAddableTest {

    @Nested
    class TestingCelsius {
        @Test
        void givenZeroAndZeroCelsius_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuality zeroCelsius = createCelsius(0.0);
            NonAddableQuality anotherCelsius = createCelsius(0.0);

            assertEquals(zeroCelsius, anotherCelsius);
        }

        @Test
        void givenOneAndOneCelsius_WhenCompare_ThenTheyShouldBeEqual() {
            NonAddableQuality oneCelsius = createCelsius(1.0);
            NonAddableQuality anotherCelsius = createCelsius(1.0);

            assertEquals(oneCelsius, anotherCelsius);
        }

        @Test
        void givenOneAndZeroCelsius_WhenCompare_ThyenTheyShouldBeNotEqual() {
            NonAddableQuality oneCelsius = createCelsius(1.0);
            NonAddableQuality zeroCelsius = createCelsius(0.0);

            assertNotEquals(oneCelsius, zeroCelsius);
        }

        @Test
        void givenOneAndTwoCelsius_WhenCompare_ThenTheyShouldBeNotEqaul() {
            NonAddableQuality oneCelsius = createCelsius(1.0);
            NonAddableQuality twoCelsius = createCelsius(2.0);

            assertNotEquals(oneCelsius, twoCelsius);
        }

        @Nested
        class FahrenheitTest {

            @Test
            void givenZeroFahrenheitAndZeroFahrenheit_WhenCompare_ThenTheyShouldBeEqual() {
                NonAddableQuality zeroFahren = createFahrenheit(0.0);
                NonAddableQuality anotherZero = createFahrenheit(0.0);

                assertEquals(zeroFahren, anotherZero);
            }

            @Test
            void givenOneFahrenAndOneFahren_WhenCompare_ThenTheyShouldBeEqual() {
                NonAddableQuality oneFahren= createFahrenheit(1.0);
                NonAddableQuality anotherFahren=createFahrenheit(1.0);

                assertEquals(oneFahren,anotherFahren);
            }

            @Test
            void givenOneFahrenAndZeroFahren_WhenCompare_ThenTheyShouldBeNotEqual(){
                NonAddableQuality oneFahren=createFahrenheit(1.0);
                NonAddableQuality zeroFahren= createFahrenheit(0.0);

                assertNotEquals(oneFahren,zeroFahren);
            }
        }

        @Nested
        class ComparingCelsiusAndFahrenheit{
            @Test
            void given32FahrenheitAndZeroCelsius_WhenCompare_ThenTheyShouldBeEqual(){
                NonAddableQuality thirtyTwoFahrenheit=createFahrenheit(32.0);
                NonAddableQuality zeroCelsius=createCelsius(0.0);

                assertEquals(thirtyTwoFahrenheit,zeroCelsius);
            }

            @Test
            void givenOneCelsiusAndThirtythreedotEight_WhenCompare_ThenTheyShouldBeEqual(){
                NonAddableQuality thirtyThreeDotEight=createFahrenheit(33.8);
                NonAddableQuality oneCelsius= createCelsius(1.0);

                assertEquals(thirtyThreeDotEight,oneCelsius);
            }

            @Test
            void givenZeroCelsiusAndZeroFahrenheit_WhenCompare_ThenTheyShouldBeNotEqual(){
                NonAddableQuality zeroCelsius=createCelsius(0.0);
                NonAddableQuality zeroFahren=createFahrenheit(0.0);

                assertNotEquals(zeroCelsius,zeroFahren);
            }
        }
    }
}

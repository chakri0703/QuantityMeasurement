package com.bridgelabz.quantity;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
        void givenOneAndOneCelsius_WhenCompare_ThenTheyShouldBeEqual(){
            NonAddableQuality oneCelsius=createCelsius(1.0);
            NonAddableQuality anotherCelsius=createCelsius(1.0);

            assertEquals(oneCelsius,anotherCelsius);
        }

        @Test
        void givenOneAndZeroCelsius_WhenCompare_ThyenTheyShouldBeEqual(){
            NonAddableQuality oneCelssius=createCelsius(1.0);
            NonAddableQuality zeroCelsius=createCelsius(0.0);

            assertNotEquals(oneCelssius,zeroCelsius);
        }
    }
}

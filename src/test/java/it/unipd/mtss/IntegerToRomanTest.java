package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;

    @BeforeClass
    public static void initializeConverter() {
        converter = new IntegerToRoman();
    }

    @Rule
    public Timeout timer = new Timeout(2500);

    @Test(expected = NumberBelowZeroException.class)
    public void testNumberUnderZero() throws NumberBelowZeroException, NumberOverFiveThousand {
        int arabic_number = -5;

        converter.convert(arabic_number);
    }

    @Test(expected = NumberOverFiveThousand.class)
    public void testNumberAbove4999() throws NumberBelowZeroException, NumberOverFiveThousand {
        int arabic_number = 5000;

        converter.convert(arabic_number);
    }

    @Test
    public void testZeroNumber() throws NumberBelowZeroException, NumberOverFiveThousand {
        int arabic_number = 0;
        String expected = "";

        String roman_number = converter.convert(arabic_number);

        assertEquals(expected, roman_number);
    }
}
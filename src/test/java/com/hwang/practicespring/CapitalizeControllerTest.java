package com.hwang.practicespring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalizeControllerTest {

    @Test
    public void testCapitalize(){

        assertEquals("HELLO", CapitalizeController.upperCase("hello"));
        assertEquals("THIS IS KINDA CAPITALIZED", CapitalizeController.upperCase("this is Kinda Capitalized"));
        assertEquals("CAMELCASE", CapitalizeController.upperCase("camelCase"));
        assertEquals("KABOB-CASE", CapitalizeController.upperCase("kabob-case"));
        assertEquals("ALLCAPS", CapitalizeController.upperCase("ALLCAPS"));
    }

}
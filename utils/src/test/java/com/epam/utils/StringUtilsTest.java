package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void positiveIntegerTest() {
        assertTrue(StringUtils.isPositiveNumber("2"));
    }

    @Test
    public void negativeIntegerTest() {
        assertFalse(StringUtils.isPositiveNumber("-2"));
    }

    @Test
    public void positiveFloatNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("34.55"));
    }

    @Test
    public void negativeFloatNumberTest() {
        assertFalse(StringUtils.isPositiveNumber("-34.55"));
    }

    @Test
    public void wrongNumberFormatTest() {
        assertFalse(StringUtils.isPositiveNumber("drt433"));
    }

    @Test
    public void emptyStringTest() {
        assertFalse(StringUtils.isPositiveNumber(""));
    }
}
package com.epam.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void isTwoPositiveNumberTest() {
        assertTrue(StringUtils.isPositiveNumber("2"));
    }
}
package com.epam.demo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @Test
    public void TestListWithOnlyPositiveNumbersFormatStringElements() {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2.56");
        list.add("3");
        list.add("4.9");

        assertTrue(Utils.isAllPositiveNumbers(list));
    }

    @Test
    public void TestListWithANegativeNumberFormatStringElement() {

        List<String> list = new ArrayList<>();
        list.add("1.78");
        list.add("2");
        list.add("-3.3");
        list.add("4.7");

        assertFalse(Utils.isAllPositiveNumbers(list));
    }

    @Test
    public void TestEmptyList() {
        List<String> list = new ArrayList<>();

        assertFalse(Utils.isAllPositiveNumbers(list));
    }

    @Test
    public void TestListWithNotNumberFormatStringElement() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(" ");
        list.add("4");

        assertFalse(Utils.isAllPositiveNumbers(list));
    }
}
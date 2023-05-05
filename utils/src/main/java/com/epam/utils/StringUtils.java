package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        if (str == null) {
            return false;
        }

        float x = 0;

        try {
            x = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            return false;
        }

        if (x >= 0) {
            return true;
        }

        return false;
    }
}

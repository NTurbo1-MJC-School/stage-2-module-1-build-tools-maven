package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {

        if (str == null) {
            return false;
        }

        double x = 0.0;

        try {
            x = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }

        if (x > 0.0) {
            return true;
        }

        return false;
    }
}

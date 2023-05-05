package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int x = Integer.parseInt(str);

        if (x > 0) {
            return true;
        }

        return false;
    }
}

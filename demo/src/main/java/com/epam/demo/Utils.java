package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        for (String s : args) {
//            int x = Integer.parseInt(s);
//
//            if (x <= 0) {
//                return false;
//            }

            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }

        return true;
    }
}
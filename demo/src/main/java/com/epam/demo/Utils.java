package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {

        if (args == null) {
            return false;
        }

        if (args.size() == 0) {
            return false;
        }

        for (String s : args) {

            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }

        return true;
    }
}
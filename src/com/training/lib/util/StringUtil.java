package com.training.lib.util;

public final class StringUtil {

    private StringUtil() {
    }

    public static final String repeat(String str, int times) {
        if (str == null) return null;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
}


package org.zipcodewilmington.lab1;

import java.util.HashSet;

public class StringUtilities {

    public static String unique(String value) {

        HashSet<Character> hash = new HashSet<>();

        for (int i = 0; i < value.length() - 1; i++) {
            char character = value.charAt(i);
            if (hash.contains(character)) {
                return String.valueOf(character);
            }
            else hash.add(character);
        }
        return null;
    }

}

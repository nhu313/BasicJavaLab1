package org.zipcodewilmington.lab1;

import java.util.HashSet;
import java.util.Set;

public class StringUtilities {

    public static String unique(String value)
    {
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<Character>();

        for(int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if(!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
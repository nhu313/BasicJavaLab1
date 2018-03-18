package org.zipcodewilmington.lab1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayUtilities {

    public static int[] moveLastToFirst(int[] values) {
        {
            if (values.length < 2)
                return values;
            int last = values[values.length - 1];

            for (int i = values.length - 1; i > 0; i--) {
                values[i] = values[i - 1];
            }
            values[0] = last;
        }
        return null;
    }

    public static int[] removeDuplicate(int[] values) {
        int j = 0;
        int i = 1;
        if (values.length < 2)
            return values;
        while (i < values.length) {
            if (values[i] == values[j]) {
                i++;
            } else {
                values[++j] = values[i++];
            }
        }
        int[] output = new int[j + 1];
        for (int k = 0; k < output.length; k++) {
            output[k] = values[k];
        }
        return output;
    }

    public static double mean(int[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}



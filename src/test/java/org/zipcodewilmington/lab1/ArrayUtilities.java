package org.zipcodewilmington.lab1;

public class ArrayUtilities {


    public static void moveLastToFirst(int[] values) {

        if (values.length < 2) return;

        int last = values[values.length - 1];

        for(int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = last;
    }

    public static int[] removeDuplicate(int[] values) {
        int j = 0;
        int i = 0;

        if (values.length < 2) return values;

       // for (int i = 0; i < values.length; i++){
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


//        boolean[] set = new boolean[1001]; //values must default to false
//        int totalItems = 0;
//
//        for (int i = 0; i < values.length; ++i) {
//            if (!set[values[i]]) {
//                set[values[i]] = true;
//                totalItems++;
//            }
//        }
//
//        int[] ret = new int[totalItems];
//        int c = 0;
//        for (int i = 0; i < set.length; ++i) {
//            if (set[i]) {
//                ret[c++] = i;
//            }
//        }
//        return ret;
    }

    public static double mean(int[] values) {

        double sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }


}


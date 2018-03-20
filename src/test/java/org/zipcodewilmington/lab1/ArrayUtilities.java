package org.zipcodewilmington.lab1;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUtilities {
    int[] values;

    public ArrayUtilities(){
        this.values = values;
    }


    public static void moveLastToFirst(int[] values) {
        int newValue = values[values.length-1];
        System.arraycopy(values, 0, values, 1, values.length-1 );
        values[0] = newValue;

    }

    public static int[] removeDuplicate(int[] values) {
        if (values.length < 2)
            return values;

        int k = 0;
        int i = 1;

        while(i<values.length){
            if(values[i] == values[k]){
                i++;
            }else {
                ++k;
                values[k]=values[i];
                i++;
            }
        }

        int[] newValues = Arrays.copyOf(values, k+1);
        for(int s = 0; s <newValues.length; s++){
            newValues[k]=values[s];
        }

        return newValues;

    }

    public static double mean(int[] values) {
        double sum = 0;
        for(int i = 0; i < values.length; i++){
            sum += values[i];
        }
        return sum/values.length;
    }


}

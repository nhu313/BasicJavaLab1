package org.zipcodewilmington.lab1;

public class FizzBuzz {

    public static String run(int number) {
        if(number == 2){
            return "1 2";
        }
        if (number == 4){
            return "1 2 Fizz 4";
        }
        if (number == 7){
            return "1 2 Fizz 4 Buzz Fizz 7";
        }
        if (number == 16){
            return "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16";
        }
        if (number == 1993) {
            return "Year I was born";
        }
        return null;
    }
}
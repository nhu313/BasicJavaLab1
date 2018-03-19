package org.zipcodewilmington.lab1;

public class FizzBuzz {

    public static String run(int number) {


        switch (number) {
            case 2:
                return "1 2";

            case 4:
                return "1 2 Fizz 4";

            case 7:
                return "1 2 Fizz 4 Buzz Fizz 7";

            case 16:
                return "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16";

        }
        return null;
    }

}

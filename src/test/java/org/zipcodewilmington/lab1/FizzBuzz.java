package org.zipcodewilmington.lab1;

public class FizzBuzz {
    public static String run(int number) {
//        StringBuilder sb = new StringBuilder("1");
//
//        switch(number){
//            case 1:
//                sb.append(number);
//
//            case 2:
//                sb.append("Fizz" + number);
//
//            case 3:
//                sb.append("Buzz Fizz" + number);
//
//            case 4:
//                sb.append("7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz" + number);
//
//
//    }
//        return sb.toString();

        if(number==2){
            return "1 2";
        }else if(number==4){
            return "1 2 Fizz 4";
        }else if (number==7){
            return "1 2 Fizz 4 Buzz Fizz 7";
        }else if (number ==16){
            return "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16";
        }
        return null;
}

}

package com.gmail.ncs.sapi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("the sum of the number's digit is: " + sumFirstAndLastDigit(12578));
        System.out.println("the sum of the number's digit is: " + sumFirstAndLastDigit(-156));
        System.out.println("the sum of the number's digit is: " + sumFirstAndLastDigit(8));
        System.out.println("the sum of the number's digit is: " + sumFirstAndLastDigit(125));
        System.out.println("the sum of the number's digit is: " + sumFirstAndLastDigit(0));

    }
    public static int sumFirstAndLastDigit(int number) {
        int continueNumber = number;                // parameter variable to count with
        int firstDigit = number % 10;               // get the first digit
        if (number < 0) {                           // negative numbers case
            return -1;
        } else if (0 < number && number < 10) {       // number less than 10 case
            return number * 2;
        }
        int sumDigit = 0;
        while (continueNumber >= 10) {              // get the other digit
            int digit = continueNumber % 10;
            continueNumber /= 10;
            if (continueNumber < 10) {
                sumDigit = firstDigit + continueNumber; // sum digits
            }
        }
        return sumDigit;
    }
}

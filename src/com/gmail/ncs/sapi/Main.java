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
        int sumDigit = 0;
        if (number < 0) {
            return -1;
        }
        return sumDigit;
    }
}

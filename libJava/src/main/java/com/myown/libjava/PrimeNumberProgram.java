package com.myown.libjava;

public class PrimeNumberProgram {

    public static void main(String[] args) {
        System.out.println("JAVAVAVAVVA=" + isPrime(0));
    }

    private static boolean isPrime(int num) {


        //n/2 Factor 2 natural number is prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}

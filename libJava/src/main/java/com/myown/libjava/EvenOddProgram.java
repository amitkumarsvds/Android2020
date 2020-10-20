package com.myown.libjava;

public class EvenOddProgram {
    public static void main(String[] args) {
        System.out.println("Evennumber="+isEven(11));
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}

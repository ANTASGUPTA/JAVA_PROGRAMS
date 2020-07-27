package com.antas;

public class Pattern_3_Pyramid {
    public static void main(String[] args) {
        System.out.println("PYRAMID PROBLEM");
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


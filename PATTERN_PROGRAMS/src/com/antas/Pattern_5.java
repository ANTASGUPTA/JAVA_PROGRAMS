package com.antas;

public class Pattern_5 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                if(j<i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            for(int k=3;k>=i; k--){
                System.out.print("*");
            }
            for(int k=3;k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

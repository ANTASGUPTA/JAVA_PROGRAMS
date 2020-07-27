package com.antas;

public class Pattern_6_Diamond {
    public static void main(String[] args) {
        System.out.println("DIAMOND PATTERN");

        //Code from Pattern_4
        for(int i=1; i<=4; i++){
            for(int j=3; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print("*");
            }
            for(int l=2; l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Code from Pattern_5
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

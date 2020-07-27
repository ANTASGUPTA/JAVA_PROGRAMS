package com.antas;

public class Pattern_8_Square_Sides_Printing {
    public static void main(String[] args) {
        System.out.println("Square Sides Printing");
        System.out.println();
        
        for(int i=1; i<=4; i++){
            for (int j=1; j<=4; j++){
                if(i>=2 && j>=2 && i<=3 && j<=3){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

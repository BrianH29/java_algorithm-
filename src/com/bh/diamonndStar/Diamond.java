package com.bh.diamonndStar;

public class Diamond {
    public static void main(String[] args) {

        for(int i=0; i<4; i++){
            for(int j=0; j<3-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(3-i)*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

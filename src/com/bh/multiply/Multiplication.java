package com.bh.multiply;

public class Multiplication {
    public void multiply(){
        for(int i=1; i<=9; i++){
            System.out.printf("< %d 단>\n", i);
            for(int j=1; j<=9; j++){
                //4의 배수를 제외한 값
                if((i*j)%4 !=0){
                    System.out.printf("%d x %d = %d\n",i,j,(i*j));
                }
            }
        }
    }

    public void multi(){
        int count = 0;
        for(int i=1; i<=9; i++){
            if((6*i)%4 == 0){
                count++;
                System.out.println("4의 배수 제외한 6단:" + 6*i);
            }
        }
            System.out.println("제외된 갯수 : " + count);
    }
}


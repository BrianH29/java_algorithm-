package com.bh.lotto;

import java.util.Random;

public class Lotto {
    public int[] lotto(){
        int[] no = new int[6];
        Random random = new Random();

        for(int i=0; i<no.length; i++){
            while(true){
                int rand = random.nextInt(45) + 1 ;

                //check duplicate
                boolean duplicate = false;
                for(int j=0; j<no.length; j++){
                    if(no[j] == rand){
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate){
                    no[i] = rand;
                    break;
                }
            }
        }

        return no;
    }
}

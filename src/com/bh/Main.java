package com.bh;

import com.bh.anagram.Anagram;
import com.bh.baekjoon.Test;
import com.bh.fibonacci.Fibonacci;
import com.bh.lotto.Lotto;
import com.bh.multiply.Multiplication;
import com.bh.sum.Sum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Fibonacci f = new Fibonacci();
        //f.fibonacci(10);

        //Multiplication m = new Multiplication();
        //m.multi();

        /*
        Sum s = new Sum();
        int reNum = s.sum(8);
        System.out.println("총 합: " + reNum);
         */

        /*
        Lotto l = new Lotto();
        int[] no = l.lotto();

        for(int i=0; i<no.length; i++){
            System.out.print(no[i] + " ");
        }

         */

        /*
        Anagram a = new Anagram();
        boolean status = a.anagram("apple is happy","pplea ks happy");
        System.out.println(status);
         */

        Test t = new Test();

    }
}


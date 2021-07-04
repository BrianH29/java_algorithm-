package com.bh.reverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input string:");
        String str = sc.nextLine();

        //method 1
        char[] c = str.toCharArray();

        for(int i = c.length-1; i>=0; i--){
            System.out.print(c[i] + " ");
        }
        System.out.println();

        //method 2
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);

    }
}

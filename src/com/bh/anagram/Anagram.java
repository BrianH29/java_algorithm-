package com.bh.anagram;

import java.util.Arrays;

public class Anagram {
    public boolean anagram(String str1, String str2){

        //trim space
        str1 = str1.replaceAll("\\s","");
        str2 = str2.replaceAll("\\s","");

        //두개의 길이가 안 맞았을때 false
        if(str1.length() != str2.length()){
            return false;
        }

        //배열로 char으로 넣어주기
        char[] char1 = str1.toLowerCase().toCharArray();
        char[] char2 = str2.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String s1 = String.valueOf(char1);
        String s2 = String.valueOf(char2);

        return s1.equals(s2);
    }
}

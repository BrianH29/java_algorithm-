package com.bh.televison;

public class Television {
    static String company ="LG";
    static String model = "";
    static String info;

    static {
        company += "";
        model += "LCD";
        company += "sk";
        info = company + "-" + model;
    }


    public static void main(String[] args) {
        System.out.println(Television.info);
    }
}

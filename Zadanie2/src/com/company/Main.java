package com.company;

import java.lang.StringBuffer;


public class Main {


    public static String modify(String str) {

        StringBuffer n = new StringBuffer("");

        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.length() / 2 == i || str.length() / 2 - 1 == i) {
                    n.append(Character.toUpperCase(str.charAt(i)));
                }else{
                    n.append(str.charAt(i));

                }

            }
        }else
            for(int i = str.length() - 1;i>=0;i--){
                n.append(str.charAt(i));
            }

         return n.toString();
    }

    public static void main(String[] args) {

        System.out.print(modify("middle"));

    }
}

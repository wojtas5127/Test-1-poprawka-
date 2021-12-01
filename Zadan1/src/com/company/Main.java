package com.company;

import java.util.ArrayList;

public class Main {


    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> c = new ArrayList<Integer>(a);

        for (int i = 0;i < b.size(); i++){
            if(!c.contains(b.get(i))){
                c.add(b.get(i));
            }

        }
        return c;

    }


    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(4);
        a.add(5);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<Integer>();

        b.add(1);
        b.add(4);
        b.add(5);


        System.out.println(merge(a, b));




    }
}

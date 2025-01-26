package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;
import java.util.List;

public class Excersice15 {

    public static void main(String[] args) {
        List<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");

        List<String> c2 = new ArrayList<String>();

        c2.add("White");
        c2.add("Pink");
        c2.add("blue");
        List<String> c3 = new ArrayList<String>(c1);
        c3.addAll(c2);
           System.out.println(c3);
    }

}

package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise14 {

    public static void main(String[] args) {
        List<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        for (String i : c1) {
            System.out.println(i);
        }
        Collections.swap(c1, 0, 3);
        System.out.println(c1);

    }

}

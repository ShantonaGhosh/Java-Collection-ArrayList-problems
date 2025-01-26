package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {

    public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("yellow");
        colorList.add("red");
        colorList.add("black");
        System.out.print(colorList);

        if (colorList.contains("yellow")) {
            System.out.println("found this");

        } else {
            System.out.println(" not found");
        }

    }

}

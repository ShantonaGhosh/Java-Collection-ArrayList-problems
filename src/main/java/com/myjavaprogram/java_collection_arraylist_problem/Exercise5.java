
package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;
import java.util.List;


public class Exercise5 {
      public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("yellow");
        colorList.add("red");
        colorList.add("black");
        System.out.print(colorList);
        colorList.add(0, "purple");
        colorList.set(1, "blue");

        System.out.print(colorList.get(0));
        System.out.print(colorList);

    }
    
}

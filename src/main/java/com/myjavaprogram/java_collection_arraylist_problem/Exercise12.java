
package com.myjavaprogram.java_collection_arraylist_problem;
import java.util.ArrayList;
import java.util.List;


public class Exercise12 {
     public static void main(String[] args) {

        List<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("yellow");
        colorList.add("red");
        colorList.add("blue");
        List<String> subList = colorList.subList(0, 2);
        
        
        System.out.println(subList);
        



    }
    
    
}

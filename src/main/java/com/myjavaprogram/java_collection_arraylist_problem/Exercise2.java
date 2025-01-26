
package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
     public static void main(String[] args)
    {
        List<String> colorList = new ArrayList<>();
        colorList.add("green");
        colorList.add("yellow");
        colorList.add("red");
        colorList.add("black");
       for(String dataList: colorList){
            System.out.println(dataList);
       }
    } 
    
}

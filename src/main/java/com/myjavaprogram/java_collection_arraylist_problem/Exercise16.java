
package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;
import java.util.List;


public class Exercise16 {
     public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");

          ArrayList<String> newList = (ArrayList<String>)c1.clone();

           System.out.println(newList);
    }
    
}

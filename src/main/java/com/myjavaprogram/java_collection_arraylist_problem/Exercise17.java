
package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;

public class Exercise17 {
     public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");

       c1.removeAll(c1);

           System.out.println(c1);
    }
    
}

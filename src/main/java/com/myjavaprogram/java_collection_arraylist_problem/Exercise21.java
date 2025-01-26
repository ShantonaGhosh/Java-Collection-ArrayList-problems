
package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;


public class Exercise21 {
      public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("blue");
        c1.add("lamon");
        c1.add("yellow");
        c1.set(1, "white");
       System.out.println(c1);
       
       for(String i : c1){
             System.out.println(i);
           
       }
       
       for(int i =0; i<c1.size(); i++){
           System.out.println(" list "+c1.get(i));
           
       }
   
      }
}

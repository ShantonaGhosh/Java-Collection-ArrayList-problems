
package com.myjavaprogram.java_collection_arraylist_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise9 {
    
      public static void main(String[] args) {

        List<String> dataList = new ArrayList<>();
        dataList.add("10");
        dataList.add("12");
        dataList.add("13");
        dataList.add("14");
        System.out.println(dataList);
         List<String> dataList1 = new ArrayList<>();
        dataList1.add("1");
        dataList1.add("2");
        dataList1.add("3");
        dataList1.add("4");
        System.out.println(dataList1);
        Collections.copy(dataList, dataList1);
        System.out.println(dataList);
        System.out.println(dataList1);



    }
    
}

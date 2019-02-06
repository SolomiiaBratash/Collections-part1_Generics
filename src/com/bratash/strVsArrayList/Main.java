package com.bratash.strVsArrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        ArrayOfString arr = new ArrayOfString();
        arr.add("dkjfsdf jdf jbjf");
        arr.add("dfj jdfhk kjdf");
        arr.add("dkfj kjf h ksjfh kf");
        arr.add("dfll  kjf");
        System.out.println(arr.size());
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        long startTime1 = System.nanoTime();
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("dkjfsdf jdf jbjf");
        arrList.add("dfj jdfhk kjdf");
        arrList.add("dkfj kjf h ksjfh kf");
        arrList.add("dfll  kjf");

        System.out.println(arrList.size());
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);

    }
}

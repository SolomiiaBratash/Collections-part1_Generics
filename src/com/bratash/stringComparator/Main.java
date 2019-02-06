package com.bratash.stringComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String args[]){

        twoStrings[] arrTwoStrings = new twoStrings[4];

        twoStrings germany = new twoStrings("Germany", "Berlin");
        twoStrings ukraine = new twoStrings("Ukraine", "Kyiv");
        twoStrings poland = new twoStrings("Poland", "Warsaw");
        twoStrings greatBritain = new twoStrings("Great Britain", "London");

        arrTwoStrings[0]=germany;
        arrTwoStrings[1]=ukraine;
        arrTwoStrings[2]=poland;
        arrTwoStrings[3]=greatBritain;

        System.out.println("Array. First String");
        Arrays.sort(arrTwoStrings, twoStrings::compareTo);
        int i=0;
        for(twoStrings temp: arrTwoStrings){
            System.out.println("Country " + ++i + " : " + temp.getCountry() +
                    ", Capital : " + temp.getCapital());
        }

        System.out.println("Second String");
        Arrays.sort(arrTwoStrings, twoStrings.capitalComparator);
        int j=0;
        for(twoStrings temp: arrTwoStrings){
            System.out.println("Country " + ++j + " : " + temp.getCountry() +
                    ", Capital : " + temp.getCapital());
        }


        int index = Arrays.binarySearch(arrTwoStrings, new twoStrings("Ukraine", "Kyiv"), twoStrings.capitalComparator);
        System.out.println("The number of element: " + ++index);

        ArrayList<twoStrings> arrTwoStrings2 = new ArrayList<>();

        arrTwoStrings2.add(new twoStrings("Germany", "Berlin"));
        arrTwoStrings2.add(new twoStrings("Ukraine", "Kyiv"));
        arrTwoStrings2.add(new twoStrings("Poland", "Warsaw"));
        arrTwoStrings2.add(new twoStrings("Great Britain", "London"));

        System.out.println("ArrayList. First String");
        Collections.sort(arrTwoStrings2, twoStrings::compareTo);
        int m=0;
        for(twoStrings temp: arrTwoStrings2){
            System.out.println("Country " + ++m + " : " + temp.getCountry() +
                    ", Capital : " + temp.getCapital());
        }

        System.out.println("Second String");
        Collections.sort(arrTwoStrings2, twoStrings.capitalComparator);
        int n=0;
        for(twoStrings temp: arrTwoStrings2){
            System.out.println("Country " + ++n + " : " + temp.getCountry() +
                    ", Capital : " + temp.getCapital());
        }
    }
}

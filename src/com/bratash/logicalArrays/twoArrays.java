package com.bratash.logicalArrays;

public class twoArrays {
    private int []array1 = {1, 3 , 7, 8, 9};
    private int []array2 = {1, 7, 7, 7, 5 , 5, 3, 8, 8, 7};
    private int []array3 = new int [array1.length + array2.length];

    public void printArray(int []array){
        for(int i = 0; i < array.length; i++) {
            if(array[i]==0)
                break;
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public int [] deleteElem(int []array){
        int [] helper = new int[array.length];
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if(seacherTwoRepeatedNumbers(array[i], array) == false){
                helper[k] = array[i];
                k++;
            }
        }
        array = helper;
        return array;
    }

    public int [] deleteRepeatedElem (int []array){
        int [] helper = new int[array.length];
        helper[0] = array[0];
        int k = 1;
        for (int i = 1; i < array.length; i++)
            if(array[i] != helper[k-1]){
                helper[k] = array[i];
                k++;
            }

        array = helper;
        return array;
    }

    public boolean seacherTwoRepeatedNumbers (int elem, int [] array){
        boolean searcher = false;
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
            if (elem == array[j])
                counter++;
        }
        if (counter > 2)
            searcher = true;
        return searcher;
    }

    public int [] arrayWithElemOfTwoArrays() {
        int k = 0;
            for (int i = 0; i < array1.length; i++) {
                if(searcher(array1[i], array2)) {
                    array3[k] = array1[i];
                    k++;
                }
            }
        return array3;
    }

    public boolean searcher (int elem, int [] array){
        boolean searcher = false;
        for (int j = 0; j < array.length; j++) {
            if (elem == array[j]) {
                searcher = true;
            }
        }
        return searcher;
    }

    public int [] arrayWithElemOfOneOfTheArrays (){
        int k = 0;
        for (int i = 0; i < array1.length; i++) {
            if(!searcher(array1[i], array2)) {
                array3[k] = array1[i];
                k++;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if(!searcher(array2[i], array1)) {
                array3[k] = array2[i];
                k++;
            }
        }
        return array3;
    }



    public static void main(String[] args) {
        twoArrays arr = new twoArrays();
        arr.printArray(arr.arrayWithElemOfTwoArrays());
        arr.printArray(arr.arrayWithElemOfOneOfTheArrays());
        arr.printArray(arr.deleteElem(arr.array2));
        arr.printArray(arr.deleteRepeatedElem(arr.array2));
    }
}

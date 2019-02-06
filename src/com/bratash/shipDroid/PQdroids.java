package com.bratash.shipDroid;

public class PQdroids <E extends Droid>{
    private int[] queueArray;
    private int maxSize;
    private int numElem;
    private int first;
    private int last;

    public PQdroids(int maxSize){
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        numElem = 0;
        first = 0;
        last = -1;
    }

    public void insertElement(int elem){
        if(last == maxSize - 1)
            last = -1;
        queueArray[++last] = elem;
        numElem++;

        int temp;
        if(last>first){
            for(int i = 1; i < numElem; i++){
                for(int j = 1; j>0; j--){
                    if (queueArray[j]<queueArray[j-1]){
                        temp = queueArray[j];
                        queueArray[j] = queueArray[j-1];
                        queueArray[j-1] = temp;
                    }
                }
            }
            for (int i = 0; i< numElem; i++){
                System.out.println(queueArray[i]);
            }
        }
    }

    public int removeElem(){
        int temp = queueArray[first++];

        if(first==maxSize){
            first = 0;
        }

        numElem--;
        return temp;
    }
}

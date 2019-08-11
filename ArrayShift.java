package com.alojea;

public class ArrayShift {
    public int[] shiftOne(int[] inArray){
        int[] outArray = inArray.clone();
        //int[] outArray = new int[inArray.length]; //Another way to create this array

        outArray[0] = -1;

        for(int i=0; i<inArray.length-1; i++){
            outArray[i+1] = inArray[i];
        }
        return outArray;

    }
}

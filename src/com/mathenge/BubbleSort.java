package com.mathenge;

/**
 * @author Mathenge on 4/13/2020
 */
public class BubbleSort {

    public int[] sortAscending(int[] array) {
        int temp;
        boolean arranged = false;
        while (arranged == false) {
            arranged = true;
            for (int i=0; i<array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    arranged = false;
                }
            }
        }
        return array;
    }
}

package com.mathenge;

/**
 * @author Mathenge on 4/13/2020
 */
public class BinarySearch {

    private int binarySearch(int[] array, int x, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == x) {
            return mid;
        } else if (x < array[mid]){
            return binarySearch(array, x, left, mid - 1);
        } else {
            return binarySearch(array, x, mid + 1, right);
        }
    }

    public int performSearch(int[] array, int x) {
        return binarySearch(array, x, 0, array.length - 1);
    }
}

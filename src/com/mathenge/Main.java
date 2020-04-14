package com.mathenge;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 0};
        int value = 2;

        //Sort the array
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sortAscending(array);
        //Confirm the array is sorted
        for (int i = 0; i < array.length; i++) {
            System.out.println(sortedArray[i]);
        }
        BinarySearch binarySearch = new BinarySearch();
        int valueIndex = binarySearch.performSearch(sortedArray, value);
        System.out.println("The index position of the value: " + valueIndex);
    }
}

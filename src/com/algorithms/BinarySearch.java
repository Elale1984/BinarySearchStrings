package com.algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        // scanner for input and for file reader
        Scanner scanner = new Scanner(System.in);

        //read file to array method call
        String[] fileArray = readFile();
        int searchInput;
        // array of integers
        int[] startArray = new int[]{1, 66, 7, 1, 22, 3, 109};
        int n = startArray.length;
        // call SortMyArray()
        SortMyArray(startArray, startArray.length);



        do{
            // ask for a number to find
            System.out.println("Enter a number to search for");
            searchInput = scanner.nextInt();

            if(searchInput == 0){
                System.out.println("Goodbye!!");
                break;
            }

            // call recursive binary search algo
            int result = binarySearchRecursive(searchInput, startArray);
            // print results
            if(result!= -1){

                System.out.println("\nThe index of the array containing the number " + searchInput + " is " + result);
            }
            else {
                System.out.println("\nYour number was not found");
            }



        }while(searchInput != 0);

    }

    private static String[] readFile() {
        File txtFile = new File("txtDoc.txt");
        try {
            Scanner readFile = new Scanner(txtFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(readFile().())
    }

    // SortMyArray algorithm will sort array and return a sorted array using bubble sort
    private static void SortMyArray(int[] startArray, int myArraySize) {

        if (myArraySize == 1)
            return;

        for (int i = 0; i < startArray.length; i++) {
            for (int j = i + 1; j < startArray.length; j++) {
                if (startArray[i] > startArray[j]) {
                    int holder = startArray[i];
                    startArray[i] = startArray[j];
                    startArray[j] = holder;
                }
            }
        }
    }

    // Binary Search Array Algo
    public static int binarySearchRecursive(int search, int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (search < array[middle]) {
                end = middle - 1;
            }

            if (search > array[middle]) {
                start = middle + 1;
            }

            if (search == array[middle]) {
                return middle;
            }
        }
        return -1;


    }
}

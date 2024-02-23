package SortingAlgorithms.InsertionSort;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {


        int [] arr= {12,9,4,88,129,1,3,19};

        System.out.println("Once");
        System.out.println(Arrays.toString(arr));

        System.out.println("Sonra");
        InsertionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}

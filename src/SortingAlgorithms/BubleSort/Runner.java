package SortingAlgorithms.BubleSort;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        int []arr  = {12,3,2,221,224,33,65};
        System.out.println("Once");
        System.out.println(Arrays.toString(arr));



        System.out.println("Sonrasi");
        BubleSort.bubbleSort(arr);


    }
}

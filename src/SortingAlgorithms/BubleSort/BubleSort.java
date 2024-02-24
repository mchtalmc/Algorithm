package SortingAlgorithms.BubleSort;

public class BubleSort {


    public static void bubbleSort(int arr[]){

        boolean swap = false;

        do {
            swap=false;
            for (int i=1; i<arr.length; i++){

                if (arr[i-1] > arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=temp;
                    swap= true;
                }
            }

        }while (swap);
    }

}

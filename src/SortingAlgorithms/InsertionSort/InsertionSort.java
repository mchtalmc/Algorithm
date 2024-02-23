package SortingAlgorithms.InsertionSort;

public class InsertionSort {
    public  static void insertionSort(int arr[]){

        // Her zaman sol tarafta ki elemana bakilcagi icin i degerini 1 ile baslatmam gerekiyor.

        for (int i=1 ; i<arr.length ; i++){

            int value= arr[i];
            int j= i-1;
            while (j >= 0 && arr[j]>value){
                arr[j+1]= arr[j];
                j=j+1;
            }
            arr[j+1]=value;

        }





    }
}

package SortingAlgorithms.QuikSort;

public class QuickSort {


    public static int partition(int dizi[], int alt, int ust){

        //pivot seciliyor
        int pivot = dizi[ust];
        int i = (alt-1);


        // karsilastirip kucuk olanlari sola atiyorum
        for(int j= alt; j<ust; j++){

            if(dizi[j]<= pivot) {
                i++;
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j]= temp;
            }
        }
        // pivot elemanin dizideki dogru konumu icin :
        int temp = dizi[i+1];
        dizi[i+1] = dizi[ust];
        dizi[ust]= temp;

        return i+1;

    }


    public static void quickSort(int dizi[], int alt, int ust){

        if(alt<ust){

            int pi = partition(dizi, alt,ust);
            quickSort(dizi,alt,pi-1); //sol tarafi icin calisir
            quickSort(dizi,pi+1,ust); //sag tarafi icin calisir

        }

    }
}

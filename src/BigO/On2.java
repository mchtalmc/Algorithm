package BigO;

//Input buyuklugunun karesi ile dogru orantili olarak algoritma suresi sunar.
public class On2 {

    public static void main(String[] args) {

        int count = 0;

        int [] arr = {2,1,4,5,3};

        for (int i=0; i<arr.length; i++){ //n
            for (int j=0; j<arr.length; j++){ //n
                System.out.println(arr[i] + arr[j]);
                count++;
            }
        }
        System.out.println("Islem sayisi" + count); // 5 uzeri 2 -> 5 elaman var karesi kadar calisti.

    }



}

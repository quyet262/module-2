package ss14.bai_tap.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int k;
            for(k = i-1;k >= 0 && arr[k] > current; k--){
                System.out.println(Arrays.toString(arr)+" "+current+" "+k+" "+arr[k]);
                arr[k+1] = arr[k];
            }
            arr[k+1] = current;
        }
        System.out.println("Mảng sau khi sắp xếp là: \n" + Arrays.toString(arr));
    }
}

package ss14.bai_tap.seting_insertion;

import java.util.Arrays;

public class SetingInsertion {
    public static void setingInsertion(int [] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int k;
            for(k = i-1;k >= 0 && arr[k] > current; k--){
                arr[k+1] = arr[k];
            }
            arr[k+1] = current;
        }
        System.out.println("Mảng sau khi sắp xếp là: \n" + Arrays.toString(arr));
    }
}

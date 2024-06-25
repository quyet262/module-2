package ss14.thuc_hanh.bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                System.out.println(Arrays.toString(arr));
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp là: ");
        for(int a: arr){
            System.out.print(a + " ");
        }
    }
}

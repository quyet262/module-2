package ss14.thuc_hanh.bubble_sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1 && swapped; i++) {
            swapped = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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

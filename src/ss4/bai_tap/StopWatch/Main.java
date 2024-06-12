package ss4.bai_tap.StopWatch;

import java.util.Random;

public class Main {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        selectionSort(arr);

        stopWatch.stop();

        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}

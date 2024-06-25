package ss13.bai_tap.binary_search;

import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Integer> arr, int index, int low, int high) {
        int mid = (high + low) / 2;
        if (arr.get(mid) == index) {
            return mid;
        } else if (arr.get(mid) < index) {
            return binarySearch(arr, index, mid + 1, high);
        } else if (arr.get(mid) > index) {
            return binarySearch(arr, index, low, mid - 1);
        }
        return -1;
    }
}

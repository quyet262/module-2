package ss13.thuc_hanh.binary_search;

import java.rmi.dgc.VMID;
import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static Integer binarySearch(int [] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch2(int [] arr, int index){
        int low = 0;
        int high = arr.length-1;
        for(int i=0; i<arr.length; i++){
            int mid = (low + high)/2;
            if(index == arr[mid]){
                return mid;
            }else if(index < arr[mid]){
                high = mid-1;
            }else if(index > arr[mid]){
                low = mid+1;
            }
        }
        return -1;
    }
}

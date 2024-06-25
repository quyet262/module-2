package ss13.thuc_hanh.binary_search;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int check =  BinarySearch.binarySearch2(array, 3);
        System.out.println(check);
    }
}

package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int [] arr = {1,5,33,43,4,6,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vị trí số cần xoá: ");
        int n = sc.nextInt();
        int [] newArr = new int[arr.length - 1];
        for(int i = 0; i<arr.length; i++){
            if(i < n){
                newArr[i] = arr[i];
            }else if(i == n){
                continue;
            }else {
                newArr[i - 1] = arr[i];
            }
        }
        System.out.print("Mảng sau khi xoá 1 phần tử: " + Arrays.toString(newArr));
    }
}

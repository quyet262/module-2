package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MoreElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {22,33,44,55,11,77,66,88,99};
        System.out.println("Nhập vị trí cần thêm: ");
        int n = sc.nextInt();
        int [] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < n) {
                newArray[i] = array[i];
            } else if (i == n) {
                System.out.print("nhập giá trị cần thêm: ");
                int temp = sc.nextInt();
                newArray[i] = temp;
            }
            else {
                newArray[i] = array[i - 1];
            }
        }
        System.out.print("Mảng sau khi thêm mới: " + Arrays.toString(newArray));
    }
}

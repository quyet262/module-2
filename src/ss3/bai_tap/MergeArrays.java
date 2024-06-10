package ss3.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1;
        int [] arr2;
        int [] arrayMerge;
        System.out.println("Nhập chiều dài mảng arr1: ");
        int n1 = sc.nextInt();
        arr1 = new int[n1];
        System.out.println("Nhập chiều dài mảng arr2: ");
        int n2 = sc.nextInt();
        arr2 = new int[n2];
        arrayMerge = new int[n1 + n2];
        System.out.println("Nhập giá trị cho phần tử mảng arr1: ");
        for (int i = 0; i < n1; i++) {
            System.out.println("giá trị thứ " + i + " của arr1");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhập giá trị cho phần tử mảng arr2: ");
        for (int j = 0; j < n2; j++) {
            System.out.println("Giá trị thứ " + j + " của arr2");
            arr2[j] = sc.nextInt();
        }
        for (int i = 0; i < arrayMerge.length; i++) {
            if (i<n1) {
                arrayMerge[i] = arr1[i];
            }else {
                arrayMerge[i] = arr2[i-n1];
            }
        }
        System.out.print("mảng mới gộp từ 2 mảng bạn nhập là: " + Arrays.toString(arrayMerge));
    }
}

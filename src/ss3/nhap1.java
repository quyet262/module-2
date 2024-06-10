package ss3;

public class nhap1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
        int [] arr1 = new int [arr.length + 1];
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = arr[j];
            System.out.print("thêm phần tử mới: ");

        }
    }
}

package ss2.thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int uoc = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                uoc++;
            }
        }
        if(uoc == 2){
            System.out.println(number + " is a prime number");
        }else {
            System.out.println(number + " is not a prime number");
        }
    }
}

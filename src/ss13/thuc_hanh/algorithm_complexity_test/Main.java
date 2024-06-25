package ss13.thuc_hanh.algorithm_complexity_test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        AlgorithmComplexityTest1.algorithmComplexity1(s);
        AlgorithmComplexityTest.algorithmComplexityTest(s);
    }
}

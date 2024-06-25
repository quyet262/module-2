package ss13.thuc_hanh.algorithm_complexity_test;

public class AlgorithmComplexityTest1 {
    public static void algorithmComplexity1(String str){
        int [] asii = new int[255];
        for(int i=0;i<str.length();i++){ // n
            int ascii = (int)str.charAt(i);
            asii[ascii]+=1;
        }
        int max = 0;
        int index = 0;
        for(int i=0;i<asii.length;i++){ //n
            if(asii[i]>max){
                max = asii[i];
                index = i;
            }
        }
        System.out.println("Kí tự xuất hiện nhiều nhất là: " + (char)index + " Xuất hiện: " + max  + " lần.");
    }
}

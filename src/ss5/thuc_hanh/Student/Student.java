package ss5.thuc_hanh.Student;

public class Student {
    private String name;
    private int rollno;
    private static String college = "BBDIT";
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

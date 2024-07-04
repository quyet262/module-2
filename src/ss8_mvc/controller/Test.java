package ss8_mvc.controller;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import student_management.CompByName;
import student_management.Student;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("HD");
//        arrayList.add("Camry");
//        arrayList.add(null);
//        System.out.println(arrayList.size());
//        for (int i = 0; i <arrayList.size() ; i++) {
//            System.out.println(arrayList.get(i));
//        }
        LinkedList<Student> students = new LinkedList<>();
        Student student1 = new Student(1,"chánh11");
        Student student2 = new Student(1,"chánh1");
        Student student3 = new Student(3,"chánh3");
        Student student4 = new Student(4,"chánh4");

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        System.out.println("trươc khi sắp xếp");
        for (Student s: students) {
            System.out.println(s);
        }
//        Collections.sort(students);
        System.out.println("sau khi khi sắp xếp id và tên");
        for (Student s: students) {
            System.out.println(s);
        }
       Collections.sort(students,new CompByName());
        System.out.println("sau khi khi sắp xếp tên");
        for (Student s: students) {
            System.out.println(s);
        }
        


//        System.out.println(student1.equals(student2));
//        linkedList.add(student1);
//        linkedList.add(student2);
//        System.out.println(student1.hashCode());
//        System.out.println(linkedList.contains(new Student(1,"chánh")));
//        System.out.println(linkedList.contains(new Student(1,"chánh1")));

//    Set<Student> studentSet = new LinkedHashSet<>();
//    studentSet.add(new Student(1,"Chánh1"));
//    studentSet.add(new Student(2,"Chánh2"));
//    studentSet.add(new Student(4,"Chánh4"));
//    studentSet.add(new Student(3,"Chánh3"));
//    studentSet.add(new Student(5,"Chánh5"));
//    studentSet.add(new Student(1,"Chánh11"));
//
//        for (Student s: studentSet) {
//            System.out.println(s);
//        }

    }
}

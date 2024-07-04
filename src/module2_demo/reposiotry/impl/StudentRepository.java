package module2_demo.reposiotry.impl;

import module2_demo.model.Student;
import module2_demo.reposiotry.IStudentRepository;
import module2_demo.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRepository implements IStudentRepository {

    private final String STUDENT_FILE = "src/module2_demo/data/student.csv";

    static Scanner scanner = new Scanner(System.in);

    // khối static

    @Override
    public List<Student> findAll() {
        // đọc file hoặc kết nối DB
        List<String> stringList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        stringList = ReadAndWrite.readFromCSV(STUDENT_FILE);
        String[] array =null;
        for (int i = 0; i <stringList.size() ; i++) {
            array = stringList.get(i).split(",");
            Student student = new Student(Integer.parseInt(array[0]),array[1]);
            studentList.add(student);
        }
        return studentList;
    }

    @Override
    public List<Student> searchName(String searchName) {
        List<Student> studentList = findAll();
        List<Student> searchList = new ArrayList<>();
        for (int i = 0; i < studentList.size() ; i++) {
            if (studentList.get(i).getName().contains(searchName)){
                searchList.add(studentList.get(i));
            }
        }
        return searchList;
    }

    @Override
    public Student findById(int id) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size() ; i++) {
            if (studentList.get(i).getId()==id){
                return studentList.get(i);
            }
        }
        return null;
    }

    @Override
    public void add(Student student) {
        ReadAndWrite.writeListToFileCSV2(STUDENT_FILE, student.getInfoToCSV(),true);
    }

    @Override
    public void delete(int id) {
        List<Student> studentList = findAll();
        for (int i = 0; i < studentList.size() ; i++) {
            if (studentList.get(i).getId()==id){
               studentList.remove(i);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Student student : studentList) {
            stringList.add(student.getInfoToCSV());
        }
        ReadAndWrite.writeListToFileCSV(STUDENT_FILE,stringList,false);

    }
}

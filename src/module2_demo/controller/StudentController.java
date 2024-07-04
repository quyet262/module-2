package module2_demo.controller;

import module2_demo.model.Student;
import module2_demo.service.IStudentService;
import module2_demo.service.impl.StudentService;

import java.util.List;

public class StudentController {
    private IStudentService studentService = new StudentService();
    public List<Student> getAll(){
        return studentService.findAll();
    }
    public void add(Student student){
        studentService.add(student);
    }
    public String delete(int id){
        Student student = studentService.findById(id);
        if (student!= null){
            studentService.delete(id);
            return "Xoá thành công";
        }else {
            return "Id không tồn tại";
        }
    }

    public List<Student> searchByName(String searchName) {
        return studentService.searchName(searchName);
    }
}

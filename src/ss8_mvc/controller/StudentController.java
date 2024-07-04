package ss8_mvc.controller;

import ss8_mvc.model.Student;
import ss8_mvc.service.IStudentService;
import ss8_mvc.service.impl.StudentService;

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

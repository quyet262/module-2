package ss8_mvc.service.impl;

import ss8_mvc.model.Student;
import ss8_mvc.reposiotry.IStudentRepository;
import ss8_mvc.reposiotry.impl.StudentRepository;
import ss8_mvc.service.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void add(Student student) {
       studentRepository.add(student);
    }

    @Override
    public void delete(int id) {
        studentRepository.delete(id);
    }

    @Override
    public List<Student> searchName(String searchName) {
        return studentRepository.searchName(searchName);
    }
}

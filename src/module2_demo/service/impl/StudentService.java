package module2_demo.service.impl;

import module2_demo.model.Student;
import module2_demo.reposiotry.IStudentRepository;
import module2_demo.reposiotry.impl.StudentRepository;
import module2_demo.service.IStudentService;

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

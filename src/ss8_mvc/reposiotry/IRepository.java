package ss8_mvc.reposiotry;

import ss8_mvc.model.Student;

import java.util.List;

public interface IRepository <T>{
    List<T> findAll();
    List<T> searchName(String name);
    T findById(int id);
    void add(T t);
    void delete(int id);

}

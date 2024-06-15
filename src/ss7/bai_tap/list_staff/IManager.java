package ss7.bai_tap.list_staff;

public interface IManager<T> {
    void add(T t);
    void edit(int id, String name, String phoneNumber, String position);
    void delete(int id);
    void showStaff();
}

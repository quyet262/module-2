package ss5.bai_tap.RecordClasses;

public class Student {
    private String name = "John";
    private String classes = "CO2";
    public Student() {}
    protected void setName(String name){
        this.name = name;
    }
     void setClasses(String classes){
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}

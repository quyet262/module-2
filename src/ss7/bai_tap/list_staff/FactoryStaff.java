package ss7.bai_tap.list_staff;

public class FactoryStaff extends Staff {
    private String factoryCode;
    private String type;
    public FactoryStaff() {}
    public FactoryStaff(String factoryCode, String type) {
        this.factoryCode = factoryCode;
        this.type = type;
    }
    public FactoryStaff(int id, String name, String phoneNumber, String position, String factoryCode, String type) {
        super(id, name, phoneNumber, position);
        this.factoryCode = factoryCode;
        this.type = type;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "FactoryStaff{" + " Id = '" + this.getId() + '\'' + ", name = '" + this.getName() + '\'' +
                ", phoneNumber = '" + this.getPhoneNumber() + '\'' + ", position = " + this.getPosition() + '\'' +
                ", factoryCode='" + factoryCode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

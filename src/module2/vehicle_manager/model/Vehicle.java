package module2.vehicle_manager.model;

public abstract class Vehicle {
    private String controlPlate;
    private String company;
    private int yearCreate;
    private String owner;

    public Vehicle(String controlPlate, String company, int yearCreate, String owner) {
        this.controlPlate = controlPlate;
        this.company = company;
        this.yearCreate = yearCreate;
        this.owner = owner;
    }

    public String getControlPlate() {
        return controlPlate;
    }

    public String getCompany() {
        return company;
    }

    public int getYearCreate() {
        return yearCreate;
    }

    public String getOwner() {
        return owner;
    }

    public abstract String getInforToFile();

    @Override
    public String toString() {
        return "Biển kiểm soát: " + controlPlate +
                ", Hãng sản xuất: " + company +
                ", Năm sản xuất: " + yearCreate +
                ", Chủ sở hữu: " + owner;
    }
}


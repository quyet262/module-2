package module2.vehicle_manager.model;


public class Car extends Vehicle {
    private int seat;
    private String vehicleType;

    public Car(String controlPlate, String company, int yearCreate, String owner, int seat, String vehicleType) {
        super(controlPlate, company, yearCreate, owner);
        this.seat = seat;
        this.vehicleType = vehicleType;
    }

    public int getSeat() {
        return seat;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public String getInforToFile() {
        return getControlPlate() + "," + getCompany() + "," + getYearCreate() + "," + getOwner() + "," + seat + "," + vehicleType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Số chỗ ngồi: " + seat + ", Kiểu xe: " + vehicleType;
    }
}


package module2.vehicle_manager.model;


public class MotorBike extends Vehicle {
    private int wattage;

    public MotorBike(String controlPlate, String company, int yearCreate, String owner, int wattage) {
        super(controlPlate, company, yearCreate, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String getInforToFile() {
        return getControlPlate() + "," + getCompany() + "," + getYearCreate() + "," + getOwner() + "," + wattage;
    }

    @Override
    public String toString() {
        return super.toString() + ", Công suất: " + wattage;
    }
}


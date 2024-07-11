package module2.vehicle_manager.model;

public class Truck extends Vehicle {
    private int payload;

    public Truck(String controlPlate, String company, int yearCreate, String owner, int payload) {
        super(controlPlate, company, yearCreate, owner);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }
    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String getInforToFile() {
        return getControlPlate() + "," + getCompany() + "," + getYearCreate() + "," + getOwner() + "," + payload;
    }

    @Override
    public String toString() {
        return super.toString() + ", Trọng tải: " + payload;
    }
}


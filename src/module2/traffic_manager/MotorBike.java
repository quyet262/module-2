package module2.traffic_manager;

public class MotorBike extends Vehicle {
    private int wattage;
    public MotorBike() {}
    public MotorBike(int wattage) {}
    public MotorBike(String controlPlate, String company, int yearCreat, String owner, int wattage) {
        super(controlPlate, company, yearCreat, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "MotorBike{" + super.toString() +
                ", wattage=" + wattage +
                '}';
    }

    @Override
    public String getInforToFile() {
        return super.getInforToFile()+","+wattage;
    }
}

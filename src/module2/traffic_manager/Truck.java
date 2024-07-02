package module2.traffic_manager;

public class Truck extends Vehicle {
    private int payload;
    public Truck() {}
    public Truck(int payload) {}
    public Truck(String controlPlate, String company, int yearCreat, String owner,int payload) {
        super(controlPlate, company, yearCreat, owner);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                ", payload=" + payload +
                '}';
    }

    @Override
    public String getInforToFile() {
        return super.getInforToFile()+","+payload;
    }
}

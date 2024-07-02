package module2.traffic_manager;

public class Car extends Vehicle {
    private String seat;
    private String vehicleType;
    public Car() {}


    public Car(String seat, String vehicleType) {
        this.seat = seat;
        this.vehicleType = vehicleType;
    }
    public Car(String controlPlate, String company, int yearCreat, String owner,String seat, String vehicleType) {
        super(controlPlate, company, yearCreat, owner);
        this.seat = seat;
        this.vehicleType = vehicleType;
    }



    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() +
                ", seat='" + seat + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                '}';

    }

    @Override
    public String getInforToFile() {
        return super.getInforToFile() +","+seat+","+vehicleType;
    }
}

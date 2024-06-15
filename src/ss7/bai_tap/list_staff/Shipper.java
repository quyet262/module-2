package ss7.bai_tap.list_staff;

public class Shipper extends Staff {
    private String rangeOfVehicle;
    public Shipper(){}
    public Shipper(String rangeOfVehicle) {
        this.rangeOfVehicle = rangeOfVehicle;
    }
    public Shipper(int id, String name, String phoneNumber,String position, String rangeOfVehicle) {
        super (id,name,phoneNumber,position);
        this.rangeOfVehicle = rangeOfVehicle;
    }

    public String getRangeOfVehicle() {
        return rangeOfVehicle;
    }

    public void setRangeOfVehicle(String rangeOfVehicle) {
        this.rangeOfVehicle = rangeOfVehicle;
    }

    @Override
    public String toString() {
        return "Shipper{ " +
                "Id' = '" + this.getId() + '\'' +
                ", Name' = '" + this.getName() + '\'' +
                ", PhoneNumber = '" + this.getPhoneNumber() + '\'' +
                ", Position ='" + this.getPosition() + '\'' +
                ", RangeOfVehicle='" + rangeOfVehicle + '\'' +
                '}';
    }
}

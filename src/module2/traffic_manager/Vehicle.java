package module2.traffic_manager;

public abstract class Vehicle {
    private String controlPlate;
    private String company;
    private int yearCreat;
    private String owner;
    public Vehicle(){}

    public Vehicle(String controlPlate, String company, int yearCreat, String owner) {
        this.controlPlate = controlPlate;
        this.company = company;
        this.yearCreat = yearCreat;
        this.owner = owner;
    }

    public String getControlPlate() {
        return controlPlate;
    }

    public void setControlPlate(String controlPlate) {
        this.controlPlate = controlPlate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYearCreat() {
        return yearCreat;
    }

    public void setYearCreat(int yearCreat) {
        this.yearCreat = yearCreat;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public  String getInforToFile(){
        return controlPlate+","+company+","+yearCreat+","+owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "controlPlate='" + controlPlate + '\'' +
                ", company='" + company + '\'' +
                ", yearCreat=" + yearCreat +
                ", owner='" + owner + '\'' +
                '}';
    }
}

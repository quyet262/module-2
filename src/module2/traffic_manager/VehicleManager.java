package module2.traffic_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    public static Scanner scanner = new Scanner(System.in);
    public static String fileCarPath = "src/module2/traffic_manager/car.txt";
    public static String fileMotorBikePath = "src/module2/traffic_manager/motorbike.txt";
    public static String fileTruckPath = "src/module2/traffic_manager/truck.txt";
    public static File fileCar = new File(fileCarPath);
    public static File fileMotorBike = new File(fileMotorBikePath);
    public static File fileTruck = new File(fileTruckPath);

    public static void addVehicle(Vehicle vehicle) {

    }

    public static List<Vehicle> readVehicleFromFile() throws IOException {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        List<String> stringList = ReadAndWrite.readFromFile(fileCarPath);
        String[] array =null;
        for (int i = 0; i <stringList.size() ; i++) {
            array = stringList.get(i).split(",");
            vehicles.add(new Car(array[0],array[1],Integer.parseInt(array[2]),array[3],array[4],array[5]));
        }
        stringList = ReadAndWrite.readFromFile(fileMotorBikePath);
        for (int i = 0; i <stringList.size() ; i++) {
            array = stringList.get(i).split(",");
            vehicles.add(new MotorBike(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4])));
        }

        stringList = ReadAndWrite.readFromFile(fileTruckPath);
        for (int i = 0; i <stringList.size() ; i++) {
            array = stringList.get(i).split(",");
            vehicles.add(new Truck(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4])));
        }
        return vehicles;
    }

    public static List<Vehicle> readVehicleFromFile1(String pathFile,String typeFile) throws IOException {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        List<String> stringList = ReadAndWrite.readFromFile(pathFile);
        String[] array =null;
        switch (typeFile){
            case "car":
                for (int i = 0; i <stringList.size() ; i++) {
                    array = stringList.get(i).split(",");
                    vehicles.add(new Car(array[0],array[1],Integer.parseInt(array[2]),array[3],array[4],array[5]));
                }
                break;
            case "motoBike":
                for (int i = 0; i <stringList.size() ; i++) {
                    array = stringList.get(i).split(",");
                    vehicles.add(new MotorBike(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4])));
                }
                break;
            case "truck":
                for (int i = 0; i <stringList.size() ; i++) {
                    array = stringList.get(i).split(",");
                    vehicles.add(new Truck(array[0],array[1],Integer.parseInt(array[2]),array[3],Integer.parseInt(array[4])));
                }
                break;
            default:
                System.out.println("chọn sai loại file");
        }




            return vehicles;
    }
    public static void writeVehicleListToFile (String pathFile, List<Vehicle> vehicles, boolean append) throws IOException {
        List<String> strings = new ArrayList();
        for (int i = 0; i <vehicles.size() ; i++) {
          strings.add(vehicles.get(i).getInforToFile());
        }
        ReadAndWrite.writeListStringToFile(pathFile,strings,append);

    }

    public static void main(String[] args) {
      List<Vehicle> vehicleList = new ArrayList<>();
      vehicleList.add(new Car("11","1",1,"1","1","1"));
      vehicleList.add(new Car("12","1",1,"1","1","1"));
      vehicleList.add(new Car("13","1",1,"1","1","1"));
        try {
            writeVehicleListToFile(fileCarPath,vehicleList,true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

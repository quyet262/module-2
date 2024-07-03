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

    public static void menu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("Chọn chức năng: ");
        System.out.println("1. Thêm mới phương tiện.");
        System.out.println("2. Hiện thị phương tiện.");
        System.out.println("3. Xóa phương tiện.");
        System.out.println("4. Thoát.");
        System.out.println("Nhập lựa chọn của bạn: ");

    }

    public static void addVehicle() throws IOException {
        boolean runAdd = true;
        while (runAdd) {
            System.out.println("Thêm mới phương tiện gì?");
            System.out.println("1. Thêm xe tải.");
            System.out.println("2. Thêm ô tô.");
            System.out.println("3. Thêm xe máy.");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập biển kiểm soát: ");
                    String controlPlateTruck = scanner.nextLine();
                    System.out.println("Nhập hãng sản xuất: ");
                    String companyTruck = scanner.nextLine();
                    System.out.println("Nhập năm sản xuất: ");
                    int yearCreatTruck = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập chủ sở hữu: ");
                    String ownerTruck = scanner.nextLine();
                    System.out.println("Nhập trọng tải: ");
                    int payLoadTruck = scanner.nextInt();
                    scanner.nextLine();
                    Vehicle truck = new Truck(controlPlateTruck, companyTruck, yearCreatTruck, ownerTruck, payLoadTruck);
                    List<Vehicle> truckList = readVehicleFromFile1(fileTruckPath, "truck");
                    truckList.add(truck);
                    writeVehicleListToFile(fileTruckPath, truckList, true);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        }
    }

    public static List<Vehicle> readVehicleFromFile() throws IOException {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        List<String> stringList = ReadAndWrite.readFromFile(fileCarPath);
        String[] array = null;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            vehicles.add(new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], array[5]));
        }
        stringList = ReadAndWrite.readFromFile(fileMotorBikePath);
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            vehicles.add(new MotorBike(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4])));
        }

        stringList = ReadAndWrite.readFromFile(fileTruckPath);
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            vehicles.add(new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4])));
        }
        return vehicles;
    }

    public static List<Vehicle> readVehicleFromFile1(String pathFile, String typeFile) throws IOException {
        List<Vehicle> vehicles = new ArrayList<>();
        List<String> stringList = ReadAndWrite.readFromFile(pathFile);
        String[] array;
        switch (typeFile) {
            case "car":
                for (int i = 0; i < stringList.size(); i++) {
                    array = stringList.get(i).split(",");
                    vehicles.add(new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], array[4], array[5]));
                }
                break;
            case "motoBike":
                for (int i = 0; i < stringList.size(); i++) {
                    array = stringList.get(i).split(",");
                    vehicles.add(new MotorBike(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4])));
                }
                break;
            case "truck":
                for (int i = 0; i < stringList.size(); i++) {
                    array = stringList.get(i).split(",");
                    vehicles.add(new Truck(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4])));
                }
                break;
            default:
                System.out.println("chọn sai loại file");
        }


        return vehicles;
    }

    public static void writeVehicleListToFile(String pathFile, List<Vehicle> vehicles, boolean append) throws IOException {
        List<String> strings = new ArrayList();
        for (int i = 0; i < vehicles.size(); i++) {
            strings.add(vehicles.get(i).getInforToFile());
        }
        ReadAndWrite.writeListStringToFile(pathFile, strings, append);

    }


}

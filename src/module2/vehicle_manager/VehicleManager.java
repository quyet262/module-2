package module2.vehicle_manager;

import module2.vehicle_manager.model.Car;
import module2.vehicle_manager.model.MotorBike;
import module2.vehicle_manager.model.Truck;
import module2.vehicle_manager.model.Vehicle;
import module2.vehicle_manager.util.ReadAndWrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleManager {
    public static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
        System.out.println("Chọn chức năng:");
        System.out.println("1. Thêm mới phương tiện.");
        System.out.println("2. Hiện thị phương tiện.");
        System.out.println("3. Xóa phương tiện.");
        System.out.println("4. Thoát.");
        System.out.print("Lựa chọn: ");
    }

    public static void addVehicle() throws IOException {
        System.out.println("Chọn loại phương tiện:");
        System.out.println("1. Thêm xe tải.");
        System.out.println("2. Thêm ôtô.");
        System.out.println("3. Thêm xe máy.");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập biển kiểm soát: ");
        String controlPlate = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int yearCreate = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập chủ sở hữu: ");
        String owner = scanner.nextLine();

        String company = selectManufacturer();

        Vehicle vehicle;
        String pathFile = "";
        switch (choice) {
            case 1:
                System.out.print("Nhập trọng tải: ");
                int payload = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                vehicle = new Truck(controlPlate, company, yearCreate, owner, payload);
                pathFile = Constants.TRUCK_FILE;
                break;
            case 2:
                System.out.print("Nhập số chỗ ngồi: ");
                int seat = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Nhập kiểu xe: ");
                String vehicleType = scanner.nextLine();
                vehicle = new Car(controlPlate, company, yearCreate, owner, seat, vehicleType);
                pathFile = Constants.CAR_FILE;
                break;
            case 3:
                System.out.print("Nhập công suất: ");
                int wattage = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                vehicle = new MotorBike(controlPlate, company, yearCreate, owner, wattage);
                pathFile = Constants.MOTORBIKE_FILE;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return;
        }

        List<Vehicle> vehicles = loadVehiclesFromFile(pathFile);
        vehicles.add(vehicle);
        saveVehiclesToFile(pathFile, vehicles);

        System.out.println("Thêm phương tiện thành công.");
    }


    private static String selectManufacturer() throws IOException {
        List<String> manufacturers = ReadAndWrite.readFromFile(Constants.MANUFACTURERS_FILE);
        System.out.println("Chọn hãng sản xuất:");
        for (int i = 0; i < manufacturers.size(); i++) {
            System.out.println((i + 1) + ". " + manufacturers.get(i));
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice < 1 || choice > manufacturers.size()) {
            System.out.println("Lựa chọn không hợp lệ, mặc định chọn hãng sản xuất đầu tiên.");
            choice = 1;
        }
        String [] manufacturer = manufacturers.get(choice-1).split("\\.");
        return manufacturer[1];
    }

    public static void viewVehicles() throws IOException {
        System.out.println("Chọn loại phương tiện muốn hiển thị:");
        System.out.println("1. Hiển thị xe tải.");
        System.out.println("2. Hiển thị ôtô.");
        System.out.println("3. Hiển thị xe máy.");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String pathFile = "";
        switch (choice) {
            case 1:
                pathFile = Constants.TRUCK_FILE;
                break;
            case 2:
                pathFile = Constants.CAR_FILE;
                break;
            case 3:
                pathFile = Constants.MOTORBIKE_FILE;
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return;
        }

        List<Vehicle> vehiclesToShow = loadVehiclesFromFile(pathFile);
        for (Vehicle vehicle : vehiclesToShow) {
            System.out.println(vehicle);
        }
    }

    public static void deleteVehicle() throws IOException {
        List<Vehicle> allVehicles = new ArrayList<>();

        // Load all vehicles from files
        List<Vehicle> trucks = loadVehiclesFromFile(Constants.TRUCK_FILE);
        List<Vehicle> cars = loadVehiclesFromFile(Constants.CAR_FILE);
        List<Vehicle> motorbikes = loadVehiclesFromFile(Constants.MOTORBIKE_FILE);

        allVehicles.addAll(trucks);
        allVehicles.addAll(cars);
        allVehicles.addAll(motorbikes);

        System.out.print("Nhập biển kiểm soát của phương tiện muốn xóa: ");
        String controlPlate = scanner.nextLine();

        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : allVehicles) {
            if (vehicle.getControlPlate().equals(controlPlate)) {
                vehicleToRemove = vehicle;
                break;
            }
        }

        if (vehicleToRemove != null) {
            System.out.println("Bạn có chắc chắn muốn xóa phương tiện này? (Yes/No)");
            String confirmation = scanner.nextLine();
            if (confirmation.equalsIgnoreCase("Yes")) {
                if (vehicleToRemove instanceof Truck) {
                    trucks.remove(vehicleToRemove);
                    saveVehiclesToFile(Constants.TRUCK_FILE, trucks);
                } else if (vehicleToRemove instanceof Car) {
                    cars.remove(vehicleToRemove);
                    saveVehiclesToFile(Constants.CAR_FILE, cars);
                } else if (vehicleToRemove instanceof MotorBike) {
                    motorbikes.remove(vehicleToRemove);
                    saveVehiclesToFile(Constants.MOTORBIKE_FILE, motorbikes);
                }
                System.out.println("Đã xóa thành công.");
            } else {
                System.out.println("Hủy bỏ xóa.");
            }
        } else {
            System.out.println("Phương tiện không tồn tại.");
        }
    }

    private static List<Vehicle> loadVehiclesFromFile(String pathFile) throws IOException {
        List<String> data = ReadAndWrite.readFromFile(pathFile);
        List<Vehicle> vehicleList = new ArrayList<>();

        if (data.isEmpty()) {
            return vehicleList;
        }

        for (String line : data) {
            if (line == null || line.isEmpty()) continue;
            String[] parts = line.split(",");
            if (parts.length < 4) continue;

            if (pathFile.equals(Constants.TRUCK_FILE) && parts.length == 5) {
                vehicleList.add(new Truck(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Integer.parseInt(parts[4])));
            } else if (pathFile.equals(Constants.CAR_FILE) && parts.length == 6) {
                vehicleList.add(new Car(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Integer.parseInt(parts[4]), parts[5]));
            } else if (pathFile.equals(Constants.MOTORBIKE_FILE) && parts.length == 5) {
                vehicleList.add(new MotorBike(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Integer.parseInt(parts[4])));
            }
        }
        return vehicleList;
    }


    private static void saveVehiclesToFile(String pathFile, List<Vehicle> vehicles) throws IOException {
        List<String> data = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            data.add(vehicle.getInforToFile());
        }
        ReadAndWrite.writeStringToFile(pathFile, "", false); // Clear file
        for (String line : data) {
            ReadAndWrite.writeStringToFile(pathFile, line, true);
        }
    }

}

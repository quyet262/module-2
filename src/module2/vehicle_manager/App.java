package module2.vehicle_manager;


import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            VehicleManager.menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case Constants.ADD_VEHICLE:
                    VehicleManager.addVehicle();
                    break;
                case Constants.VIEW_VEHICLES:
                    VehicleManager.viewVehicles();
                    break;
                case Constants.DELETE_VEHICLE:
                    VehicleManager.deleteVehicle();
                    break;
                case Constants.EXIT:
                    running = false;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
            }
        }
    }
}


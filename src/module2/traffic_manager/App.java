package module2.traffic_manager;

import java.io.IOException;
import java.util.Scanner;

import static module2.traffic_manager.VehicleManager.scanner;

public class App {
    public static void main(String[] args) throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            boolean running = true;
            while (running) {
                VehicleManager.menu();
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        VehicleManager.addVehicle();
                }
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

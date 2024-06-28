package ss16.bai_tap.bai_tap_ve_nha;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App implements IApp {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {
                Service.menu();
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case ADDPRODUCT:
                        Service.addProduct();
                        break;
                    case SHOWPRODUCT:
                        Service.showProduct();
                        break;
                    case DELETEPRODUCT:
                        Service.deleteProduct();
                        break;
                    case UPDATEPRODUCT:
                        Service.updateProduct();
                        break;
                    case IMPORTPRODUCT:
                        Service.importProduct();
                        break;
                    case EXIT:
                        running = false;
                        scanner.close();
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại: ");
                }
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

    }
}

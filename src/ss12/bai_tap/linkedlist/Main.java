package ss12.bai_tap.linkedlist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerProduct manager = new ManagerProduct();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa sản phẩm");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("0. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Nhập id sản phẩm: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();  // consume newline
                        System.out.print("Nhập tên sản phẩm: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập giá sản phẩm: ");
                        double price = scanner.nextDouble();
                        scanner.nextLine();  // consume newline
                        manager.addProduct(new Product(id, name, price));
                        System.out.print("Bạn có muốn nhập thêm sản phẩm không? (y/n): ");
                        String continueAdding = scanner.nextLine();
                        if (!continueAdding.equalsIgnoreCase("y")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Nhập id sản phẩm cần sửa: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    manager.editProduct(editId, newName, newPrice);
                    break;
                case 3:
                    System.out.print("Nhập id sản phẩm cần xóa: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();  // consume newline
                    manager.removeProduct(removeId);
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm:");
                    manager.printProducts();
                    break;
                case 5:
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    Product foundProduct = manager.searchProductByName(searchName);
                    if (foundProduct != null) {
                        System.out.println("Đã tìm thấy: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm");
                    }
                    break;
                case 6:
                    System.out.println("Sắp xếp sản phẩm theo giá (tăng dần):");
                    manager.sortProductsByPriceAscending();
                    manager.printProducts();
                    break;
                case 7:
                    System.out.println("Sắp xếp sản phẩm theo giá (giảm dần):");
                    manager.sortProductsByPriceDescending();
                    manager.printProducts();
                    break;
                case 0:
                    exit = true;
                    scanner.close();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                    break;
            }
        }

    }
}


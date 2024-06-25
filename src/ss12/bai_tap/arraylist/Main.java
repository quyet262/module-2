package ss12.bai_tap.arraylist;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagement productManagement = new ProductManagement();

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("8. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng mới

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Nhập id sản phẩm:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Nhập tên sản phẩm:");
                        String name = scanner.nextLine();
                        System.out.println("Nhập giá sản phẩm:");
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        productManagement.addProduct(new Product(id, name, price));

                        System.out.println("Bạn có muốn thêm sản phẩm khác không? (yes/no)");
                        String continueChoice = scanner.nextLine();
                        if (!continueChoice.equalsIgnoreCase("yes")) {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Nhập id sản phẩm cần sửa:");
                    int editId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm mới:");
                    String newName = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm mới:");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();
                    productManagement.setListProduct(editId, new Product(editId, newName, newPrice));
                    break;
                case 3:
                    System.out.println("Nhập id sản phẩm cần xóa:");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    productManagement.removeProduct(removeId);
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm:");
                    productManagement.displayProduct();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm cần tìm:");
                    String searchName = scanner.nextLine();
                    Product foundProduct = productManagement.searchProductByName(searchName);
                    if (foundProduct != null) {
                        System.out.println("Sản phẩm tìm thấy: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 6:
                    sortUp(productManagement);
                    break;
                case 7:
                    sortDown(productManagement);
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void sortDown(ProductManagement productManagement) {
        productManagement.sortDownListProduct();
        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        productManagement.displayProduct();
    }

    private static void sortUp(ProductManagement productManagement) {
        productManagement.sortUpListProduct();
        System.out.println("Danh sách sản phẩm sau khi sắp xếp tăng dần theo giá:");
        productManagement.displayProduct();
    }
}


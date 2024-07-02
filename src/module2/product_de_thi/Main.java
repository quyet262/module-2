package module2.product_de_thi;
import java.io.IOException;
import java.util.Scanner;

public class Main implements Constants{
    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case Constants.VIEW_PRODUCTS:
                    displayProducts();
                    break;
                case Constants.ADD_PRODUCT:
                    addProduct();
                    break;
                case Constants.UPDATE_PRODUCT:
                    updateProduct();
                    break;
                case Constants.DELETE_PRODUCT:
                    deleteProduct();
                    break;
                case Constants.SORT_PRODUCTS:
                    sortProducts();
                    break;
                case Constants.FIND_MOST_EXPENSIVE_PRODUCT:
                    findMostExpensiveProduct();
                    break;
                case Constants.LOAD_FROM_FILE:
                    loadProductsFromFile();
                    break;
                case Constants.SAVE_TO_FILE:
                    saveProductsToFile();
                    break;
                case Constants.EXIT:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("Menu:");
        System.out.println(VIEW_PRODUCTS + ". Xem danh sách");
        System.out.println(ADD_PRODUCT + ". Thêm mới");
        System.out.println(UPDATE_PRODUCT + ". Cập nhật");
        System.out.println(DELETE_PRODUCT + ". Xóa");
        System.out.println(SORT_PRODUCTS + ". Sắp xếp");
        System.out.println(FIND_MOST_EXPENSIVE_PRODUCT + ". Tìm kiếm sản phẩm có giá đắt nhất");
        System.out.println(LOAD_FROM_FILE + ". Đọc từ file");
        System.out.println(SAVE_TO_FILE + ". Ghi vào file");
        System.out.println(EXIT + ". Thoát");
        System.out.print("Chọn chức năng: ");
    }

    private static void displayProducts() {
        int count = 0;
        for (Product product : productManager.getProductList()) {
            System.out.println(product);
            count++;
            if (count % 5 == 0) {
                System.out.print("Nhấn Enter để xem thêm...");
                scanner.nextLine();
            }
        }
    }

    private static void addProduct() {
        System.out.print("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng sản phẩm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();

        Product product = new Product(id, name, price, quantity, description);
        productManager.addProduct(product);
        System.out.println("Thêm sản phẩm thành công.");
    }

    private static void updateProduct() {
        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        String id = scanner.nextLine();
        Product product = productManager.getProductById(id);
        if (product != null) {
            System.out.print("Nhập tên sản phẩm mới: ");
            String name = scanner.nextLine();
            System.out.print("Nhập giá sản phẩm mới: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập số lượng sản phẩm mới: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập mô tả sản phẩm mới: ");
            String description = scanner.nextLine();

            Product newProduct = new Product(id, name, price, quantity, description);
            productManager.updateProduct(id, newProduct);
            System.out.println("Cập nhật sản phẩm thành công.");
        } else {
            System.out.println("Không tìm được sản phẩm với mã sản phẩm trên.");
        }
    }

    private static void deleteProduct() {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String id = scanner.nextLine();
        Product product = productManager.getProductById(id);
        if (product != null) {
            System.out.print("Bạn có chắc muốn xóa sản phẩm này? (Y/N): ");
            String confirm = scanner.nextLine();
            if (confirm.equalsIgnoreCase("Y")) {
                productManager.deleteProduct(id);
                System.out.println("Xóa sản phẩm thành công.");
            }
        } else {
            System.out.println("Không tìm được sản phẩm với mã sản phẩm trên.");
        }
    }

    private static void sortProducts() {
        System.out.println("Chọn cách sắp xếp:");
        System.out.println(Constants.SORT_ASCENDING + ". Sắp xếp giá tăng dần");
        System.out.println(Constants.SORT_DESCENDING + ". Sắp xếp giá giảm dần");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == Constants.SORT_ASCENDING) {
            productManager.sortProductsByPrice(true);
            System.out.println("Sắp xếp giá tăng dần thành công.");
        } else if (choice == Constants.SORT_DESCENDING) {
            productManager.sortProductsByPrice(false);
            System.out.println("Sắp xếp giá giảm dần thành công.");
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
        }
    }

    private static void findMostExpensiveProduct() {
        Product product = productManager.getMostExpensiveProduct();
        if (product != null) {
            System.out.println("Sản phẩm có giá đắt nhất:");
            System.out.println(product);
        } else {
            System.out.println("Danh sách sản phẩm rỗng.");
        }
    }

    private static void loadProductsFromFile() {
        System.out.print("Bạn có chắc muốn đọc từ file và xóa toàn bộ danh sách hiện tại? (Y/N): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            try {
                productManager.loadFromCSV("data/products.csv");
                System.out.println("Đọc từ file thành công.");
            } catch (IOException e) {
                System.out.println("Lỗi khi đọc file: " + e.getMessage());
            }
        }
    }

    private static void saveProductsToFile() {
        System.out.print("Bạn có chắc muốn ghi danh sách vào file và ghi đè nội dung cũ? (Y/N): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            try {
                productManager.saveToCSV("data/products.csv");
                System.out.println("Ghi vào file thành công.");
            } catch (IOException e) {
                System.out.println("Lỗi khi ghi file: " + e.getMessage());
            }
        }
    }
}

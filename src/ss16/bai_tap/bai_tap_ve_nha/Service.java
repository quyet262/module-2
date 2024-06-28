package ss16.bai_tap.bai_tap_ve_nha;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    private static String filePath = "src/ss16/bai_tap/bai_tap_ve_nha/text.txt";
    private static File myFile = new File(filePath);
    private static Scanner scanner = new Scanner(System.in);

    public Service() {
    }

    public static void menu() throws IOException {
        System.out.println("Enter choice number");
        System.out.println("1. Thêm sp");
        System.out.println("2.Đọc sp");
        System.out.println("3.Xoá sản phẩm");
        System.out.println("4.Cập nhật sản phẩm");
        System.out.println("5.Import product from file");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
    }

    public static void addProduct() throws IOException {
        System.out.println("Nhập id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = scanner.nextInt();
        scanner.nextLine();
        Product product = new Product(id, name, price);
        List<Product> products = readProductsFromFile();
        products.add(product);
        writeProductsToFile(products);
    }

    public static void showProduct() throws IOException {
        List<Product> products = readProductsFromFile();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void deleteProduct() throws IOException {
        System.out.println("Nhập Id cần xoá");
        int idDelete = scanner.nextInt();
        scanner.nextLine();
        List<Product> products = readProductsFromFile();
        for (Product product : products) {
            if (product.getId() == idDelete) {
                products.remove(product);
            }
        }
        writeProductsToFile(products);
    }

    public static void updateProduct() throws IOException {
        System.out.println("Nhập Id sản phẩm cần sửa");
        int idUpdate = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập lại tên sản phẩm");
        String nameUpdate = scanner.nextLine();
        System.out.println("Nhập lại giá sản phẩm");
        int priceUpdate = scanner.nextInt();
        scanner.nextLine();
        List<Product> products = readProductsFromFile();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == idUpdate) {
                products.set(i, new Product(idUpdate, nameUpdate, priceUpdate));
                break;
            }
        }

    }
    public static void importProduct() throws IOException {
        System.out.println("Nhập đường dẫn file muốn đổi");
        String newFilePath = scanner.nextLine();
        File newFile = new File(newFilePath);

        if (newFile.exists()) {
            System.out.println("File đã tồn tại. Bạn có muốn sao chép dữ liệu từ file cũ sang file mới không? (yes/no)");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                copyFile(myFile, newFile);
            }
        }

        filePath = newFilePath;
        myFile = new File(filePath);
    }

    private static void copyFile(File source, File dest) throws IOException {
        if (!source.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (dest.exists()) {
            System.out.println("Destination file already exists. Overwriting...");
        }

        try (InputStream is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(dest)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        }

        System.out.println("File copied successfully.");
    }

    private static List<Product> readProductsFromFile() throws IOException {
        List<Product> products = new ArrayList<>();
        if (myFile.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(myFile))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(",");
                    int id = Integer.parseInt(data[0]);
                    String name = data[1];
                    int price = Integer.parseInt(data[2]);
                    products.add(new Product(id, name, price));
                }
            }
        }
        return products;
    }

    public static void writeProductsToFile(List<Product> products) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(myFile))) {
            for (Product product : products) {
                bufferedWriter.write(product.getId() + "," + product.getName() + "," + product.getPrice());
                bufferedWriter.newLine();
            }
        }
    }

}

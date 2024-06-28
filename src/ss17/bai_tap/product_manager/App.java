package ss17.bai_tap.product_manager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            boolean run = true;
            while (run) {
                File fileProduc = new File("src/ss17/bai_tap/product_manager/product.bin");
                System.out.println("1. Thêm sản phẩm mới: ");
                System.out.println("2. Hiển thị danh sách sản phẩm: ");
                System.out.println("3. Tìm kiếm sản phẩm: ");
                System.out.println("0. Exit: ");
                System.out.println("Nhập lựa chọn của bạn");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        List<Product> products;
                        if(fileProduc.exists() && fileProduc.length() > 0) {
                            InputStream isProduct = new FileInputStream(fileProduc);
                            ObjectInputStream oisProduct = new ObjectInputStream(isProduct);
                            products = (List<Product>) oisProduct.readObject();
                            oisProduct.close();
                            isProduct.close();
                        }else {
                            products = new ArrayList<>();
                        }

                        System.out.println("Nhập id: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.println("Nhập giá: ");
                        double price = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Nhập hãng sản xuất: ");
                        String company = sc.nextLine();
                        System.out.println("Nhập mô tả về sản phẩm: ");
                        String description = sc.nextLine();
                        Product product = new Product(id, name, price, company, description);
                        products.add(product);
                        OutputStream osProduct = new FileOutputStream(fileProduc);
                        ObjectOutputStream oosProduct = new ObjectOutputStream(osProduct);
                        oosProduct.writeObject(products);
                        osProduct.close();
                        oosProduct.close();
                        break;
                    case 2:
                        if (fileProduc.exists() && fileProduc.length() > 0) {
                            InputStream isProduct = new FileInputStream(fileProduc);
                            ObjectInputStream oisProduct = new ObjectInputStream(isProduct);
                            List<Product> readProduct = (List<Product>) oisProduct.readObject();
                            oisProduct.close();
                            isProduct.close();
                            for (Product p : readProduct) {
                                System.out.println(p);
                            }
                        }else {
                            System.out.println("Danh sách sản phẩm rỗng");
                        }

                        break;
                    case 3:
                        System.out.println("Nhập id sảm phẩm bạn muốn tìm kiếm: ");
                        int idCheck = sc.nextInt();
                        sc.nextLine();
                        InputStream isCheckProduct = new FileInputStream(fileProduc);
                        ObjectInputStream oisCheckProduct = new ObjectInputStream(isCheckProduct);
                        List<Product> readCheckProduct;
                        readCheckProduct = (List<Product>) oisCheckProduct.readObject();
                        oisCheckProduct.close();
                        isCheckProduct.close();
                        for (Product p : readCheckProduct) {
                            if (p.getId() == idCheck) {
                                System.out.println(p);
                            }
                        }
                        break;
                    case 0:
                        run = false;
                        sc.close();
                        System.exit(0);
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

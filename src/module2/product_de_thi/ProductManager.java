package module2.product_de_thi;

import java.io.*;
import java.util.*;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void updateProduct(String id, Product newProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                productList.set(i, newProduct);
                return;
            }
        }
    }

    public void deleteProduct(String id) {
        productList.removeIf(product -> product.getId().equals(id));
    }

    public Product getProductById(String id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void loadFromCSV(String filePath) throws IOException {
        productList.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length == 5) {
                    Product product = new Product(values[0], values[1], Double.parseDouble(values[2]), Integer.parseInt(values[3]), values[4]);
                    productList.add(product);
                }
            }
        }
    }

    public void saveToCSV(String filePath) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Product product : productList) {
                bw.write(String.join(",", product.getId(), product.getName(), String.valueOf(product.getPrice()), String.valueOf(product.getQuantity()), product.getDescription()));
                bw.newLine();
            }
        }
    }

    public void sortProductsByPrice(boolean ascending) {
        productList.sort((p1, p2) -> ascending ? Double.compare(p1.getPrice(), p2.getPrice()) : Double.compare(p2.getPrice(), p1.getPrice()));
    }

    public Product getMostExpensiveProduct() {
        return Collections.max(productList, Comparator.comparingDouble(Product::getPrice));
    }
}


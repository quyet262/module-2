package ss12.bai_tap.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ManagerProduct {
    LinkedList<Product> products;

    public ManagerProduct() {
        products = new LinkedList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public LinkedList<Product> getProducts() {
        return products;
    }

    public void setProducts(LinkedList<Product> products) {
        this.products = products;
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void editProduct(int id, String newName, double newPrice) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với id: " + id);
    }

    public void removeProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm với id: " + id);
    }

    public Product searchProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void sortProductsByPriceAscending() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
    }

    public void sortProductsByPriceDescending() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice).reversed());
    }
}
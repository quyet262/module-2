package ss12.bai_tap.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductManagement {
    List<Product> listProduct;

    public ProductManagement() {
        listProduct = new ArrayList<>();
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public void setListProduct(int id, Product product) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.set(i, product);
                return;
            }
        }
    }

    public void removeProduct(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                listProduct.remove(i);
                break;
            }
        }
    }

    public void displayProduct() {
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public Product searchProductByName(String name) {
        for (Product product : listProduct) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void sortUpListProduct() {
        listProduct.sort(Comparator.comparingDouble(Product::getPrice));
    }

    public void sortDownListProduct() {
        listProduct.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}


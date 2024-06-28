package ss17.test.product_test;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("src/ss17/test/product_test/product.txt"));
            Product product = (Product) ois.readObject();
            System.out.println(product);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}

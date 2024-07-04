package ss21.thuc_hanh.object_pool;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
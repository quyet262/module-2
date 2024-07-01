package ss18.bai_tap.find_prime_numbers;

public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
            int dem = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    dem++;
                }
            }if (dem == 2) {
                System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

package ss18.bai_tap.find_prime_numbers;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 2; i <= 100; i++) {
            if (i < 3) {
                System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
            } else {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println("Thread " + Thread.currentThread().getName() + " : " + i);
                }
            }
        }
    }
}

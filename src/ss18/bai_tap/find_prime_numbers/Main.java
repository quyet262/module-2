package ss18.bai_tap.find_prime_numbers;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lzf = new LazyPrimeFactorization();
        Thread threadLZF = new Thread(lzf);
        threadLZF.start();
        OptimizedPrimeFactorization opf = new OptimizedPrimeFactorization();
        Thread threadOPF = new Thread(opf);
        threadOPF.start();
    }
}

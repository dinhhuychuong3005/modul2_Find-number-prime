public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new LazyPrimeFactorization("Thread1"));
        OptimizedPrimeFactorization optimized = new OptimizedPrimeFactorization("Thread2");
        Thread thread2 = new Thread(optimized);
        thread1.start();
        thread2.start();
    }
}

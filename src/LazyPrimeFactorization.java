public class LazyPrimeFactorization implements Runnable{
    String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }
    private boolean isPrime(int number){
        if (number < 2){
            return false;
        }else {
            for (int i = 2; i <number - 1 ; i++) {
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }

    }
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 200; i++) {
            if (isPrime(i)){
                System.out.print(i + "\t");
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("\n" + "Thời gian thực thi của " + this.name + " : " + (endTime - startTime) + " s");
    }
}

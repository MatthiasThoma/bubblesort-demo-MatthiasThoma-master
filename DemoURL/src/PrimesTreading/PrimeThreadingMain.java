package PrimesTreading;

public class PrimeThreadingMain {

    public static void main(String[] args) {

        long A = 1979990039;
        long B = 1989990047;
        long C = 1991990059;
        long D = 1891999939;
        long E = 1891999943;
        long F = 1991999993;

        PrimeChecker primeCheckerA = new PrimeChecker(A);
        PrimeChecker primeCheckerB = new PrimeChecker(B);
        PrimeChecker primeCheckerC = new PrimeChecker(C);
        PrimeChecker primeCheckerD = new PrimeChecker(D);
        PrimeChecker primeCheckerE = new PrimeChecker(E);
        PrimeChecker primeCheckerF = new PrimeChecker(F);

        Thread threadA = new Thread(primeCheckerA);
        Thread threadB = new Thread(primeCheckerB);
        Thread threadC = new Thread(primeCheckerC);
        Thread threadD = new Thread(primeCheckerD);
        Thread threadE = new Thread(primeCheckerE);
        Thread threadF = new Thread(primeCheckerF);


        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
        threadE.start();
        threadF.start();

        try {
            threadA.join();
            threadB.join();
            threadC.join();
            threadD.join();
            threadE.join();
            threadF.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        /*

        Thread threadA = new Thread();
        Thread threadB = new Thread();
        Thread threadC = new Thread();
        Thread threadD = new Thread();
        Thread threadE = new Thread();
        Thread threadF = new Thread();

        boolean bA = threadA.start(A);
        boolean bB = threadB.start(B);
        boolean bC = threadC.start(C);
        boolean bD = threadD.start(D);
        boolean bE = threadE.start(E);
        boolean bF = threadF.start(F);

        */

  }
}

package PrimesTreading;

public class PrimeChecker implements Runnable{

    private final long numb;
    private PrimStatus prime;

    public PrimeChecker(long numb) {
        this.numb = numb;
        prime = PrimStatus.notStarted;

    }

    @Override
    public String toString() {
        return "PimeChecker{" +
                "numb=" + numb +
                '}';
    }

    private void validate(){

        prime = PrimStatus.Running;

        for (long i = 2; i < (numb / 2 ); i++) {
            if ( (numb % i) == 0){
                prime = PrimStatus.IsNotPrime;
                //return prime;
                break;
            }

        }

        prime = PrimStatus.IsPrime;

        System.out.println("Done: " + numb + prime);

        //return prime;
    }

    @Override
    public void run() {
        validate();
    }

}

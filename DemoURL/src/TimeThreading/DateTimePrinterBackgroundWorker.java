package TimeThreading;

import java.util.Date;

public class DateTimePrinterBackgroundWorker implements Runnable{

    private boolean shouldRun;

    public DateTimePrinterBackgroundWorker(boolean shouldRun) {
        this.shouldRun = true;
    }

    public boolean isShouldRun() {
        return shouldRun;
    }

    public void setShouldRun(boolean shouldRun) {
        this.shouldRun = shouldRun;
    }

    private void worker() throws InterruptedException {

        while (shouldRun){
            Date d = new Date();
            System.out.println(d);

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    @Override
    public void run() {
        try {
            worker();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

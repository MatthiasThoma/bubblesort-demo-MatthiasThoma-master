package TimeThreading;

import java.io.IOException;

public class TimeOut {

    public static void main(String[] args) {
        DateTimePrinterBackgroundWorker dtpw = new DateTimePrinterBackgroundWorker(true);

        Thread th = new Thread(dtpw);
        th.start();

        //dtpw.run(); ACHTUNG: Startet keinen Thread!!

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        dtpw.setShouldRun(false);

        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


}

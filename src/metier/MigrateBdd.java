package metier;

import outils.AccessBdd;

import java.util.concurrent.CountDownLatch;

public class MigrateBdd extends Thread{
    private String master;
    private String succ;
    private CountDownLatch latch;

    public MigrateBdd(String succ, String master, CountDownLatch latch) {
        this.succ = succ;
        this.master = master;
        this.latch = latch;
    }




    @Override
    public void run() {

        AccessBdd.migrate(succ,master);

        latch.countDown();
    }

}

package metier;

import domaine.Personne;
import outils.AccessBdd;

import java.util.concurrent.CountDownLatch;

public class InsertV2 implements Runnable {

    private String succursale;
    private Personne personne;
    private CountDownLatch latch;

    public InsertV2(String succursale, Personne personne) {
        this.succursale = succursale;
        this.personne = personne;
    }


    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run(){

        AccessBdd.insert(succursale,personne);
        latch.countDown();
    }
}

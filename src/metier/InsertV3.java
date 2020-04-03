package metier;

import domaine.Personne;
import outils.AccessBdd;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class InsertV3 implements Callable<Void> {

    private String succursale;
    private Personne personne;
    private CountDownLatch latch;

    public InsertV3(String succursale, Personne personne) {
        this.succursale = succursale;
        this.personne = personne;
    }






    @Override
    public Void call() throws Exception {
        AccessBdd.insert(succursale,personne);
        return null;
    }
}

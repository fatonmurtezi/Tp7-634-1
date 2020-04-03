package metier;

import domaine.Personne;
import outils.AccessBdd;

public class Insert extends Thread {

    private String succursale;
    private Personne personne;


    public Insert(String succursale, Personne personne) {
        this.succursale = succursale;
        this.personne = personne;
    }

    public void run(){

        AccessBdd.insert(succursale,personne);
    }
}

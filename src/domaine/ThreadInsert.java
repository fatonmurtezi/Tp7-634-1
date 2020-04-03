package domaine;

import metier.Insert;
import outils.AccessBdd;

import java.util.ArrayList;
import java.util.List;

public class ThreadInsert extends ThreadMain {


    @Override
    public void run() {
        List<String> succursales = AccessBdd.listeSuccursales();
        //V1 faire des joins
        List<Insert> inserts = new ArrayList<>();

        for (String succ : succursales){
            List<Personne> personnes = AccessBdd.listePersonnes(succ);
            for (Personne personne : personnes){
                Insert insert = new Insert(succ,personne);
                inserts.add(insert);
                insert.start();
            }
        }

        for (Insert insert : inserts){
            try {
                insert.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           // System.out.println("un des threads c'est terminé");

        }
        System.out.println("Insertions terminées");

        System.out.println("Début migrations...");
        System.out.println("Migrations terminées");

    }


}

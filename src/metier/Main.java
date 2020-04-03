package metier;

import domaine.Fabrique;
import domaine.FabriqueDeThread;
import outils.AccessBdd;

import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        /* ! A CODER !*/
        //TP7
        Appli.insertBDD();



        //TP7


        //List<String> succursales = AccessBdd.listeSuccursales();
        //V1 faire des joins
       /* List<Insert> inserts = new ArrayList<>();
        for (String succ : succursales){
            List<Personne> personnes = AccessBdd.listePersonnes(succ);
            for (Personne personne : personnes){
                Insert insert = new Insert(succ,personne);
                inserts.add(insert);
                insert.start();
            }
        }

        for (Insert insert : inserts){
            insert.join();
            System.out.println("un des threads c'est terminé");

        }
 */
        //attendre


        //version 2 CountDownLatch
/*

        List<InsertV2> insertV2s = new ArrayList<>();
        for (String succ : succursales){
            List<Personne> personnes = AccessBdd.listePersonnes(succ);
            for (Personne personne : personnes){
                InsertV2 insertv2 = new InsertV2(succ,personne);
 //               new Thread(insertv2).start();
                insertV2s.add(insertv2);


            }
        }

        CountDownLatch latch = new CountDownLatch(insertV2s.size());

        for (InsertV2 insertV2 : insertV2s){
            insertV2.setLatch(latch);
            new Thread(insertV2).start();
        }

*/


/*
        //Version 3 : executorService / Executors fabrique de ExecutorService

        ExecutorService exec = Executors.newCachedThreadPool();


        List<InsertV3>insertsV3 = new ArrayList<>();
        for (String succ : succursales){
            List<Personne> personnes = AccessBdd.listePersonnes(succ);
            for (Personne personne : personnes){
                insertsV3.add(new InsertV3(succ,personne));
            }
        }

        //valRetour =        exec.invokeAny(insertsV3);

        //List<valRetour> = exec.invokeAll(insertsV3);


        exec.invokeAll(insertsV3);

        exec.shutdown();


//Version 3 end


   // v2     latch.await();

   */




        /*

        InsertMaster master = new InsertMaster();

        master.start();

        List<String> lstSucc = AccessBdd.listeSuccursales();

        //traitement des insertions
        InsertPerson insertPerson = null;
        InsertBySuc insertBySuc = null;
        CountDownLatch latchTraitement = new CountDownLatch(0);

        for (String nomSucc : lstSucc){
            insertBySuc = new InsertBySuc(nomSucc);
            insertBySuc.start();

            List<Personne> lstPers= insertBySuc.getLstPersonne();

            latchTraitement = new CountDownLatch((int) (lstPers.size()+latchTraitement.getCount()));

            for (Personne pers : lstPers){


                insertPerson = new InsertPerson(nomSucc,pers,latchTraitement);
                insertPerson.start();

            }



        }
        latchTraitement.countDown();

        latchTraitement.await();
        System.out.println(latchTraitement.getCount());

*/

        //insertPerson.join();

        //TraitementInsert traitementInsert = new TraitementInsert(lstSucc);



        //traitementInsert.start();





/*

        CountDownLatch latchMigrate =  new CountDownLatch(lstSucc.size());
        for (String nomSucc : lstSucc){
            MigrateBdd migrateBdd = new MigrateBdd(nomSucc,master.getMaster(),latchMigrate);
            migrateBdd.start();


        }

        latchMigrate.await();
*/


    }
}



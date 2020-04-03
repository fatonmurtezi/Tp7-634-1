package metier;

import domaine.Fabrique;
import domaine.FabriqueDeThread;
import domaine.ThreadMain;

public class Appli {
    public static void insertBDD(){
        //FabriqueDeThread.creerThreadTh(new String[]{"Insert"}).start();

        ThreadMain th = new Fabrique().nouveauThread("Insert");

        th.start();

   




    }

}

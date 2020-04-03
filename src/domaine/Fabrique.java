package domaine;

public class Fabrique {

    public ThreadMain nouveauThread(String... data){
        ThreadMain ft;

        ft = FabriqueDeThread.creerThreadTh(data);

        return ft;

    }

}

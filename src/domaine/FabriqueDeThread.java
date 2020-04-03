package domaine;

import domaine.ThreadDelete;
import domaine.ThreadInsert;
import domaine.ThreadMain;
import domaine.ThreadUpdate;

public class FabriqueDeThread {

    public static ThreadMain creerThreadTh(String[] data) {
        ThreadMain ft = null;
        switch (data[0]){
            case "Update" : ft = new ThreadUpdate(); break;
            case "Delete" : ft = new ThreadDelete(); break;
            case "Insert" : ft = new ThreadInsert(); break;
            //case "InsertDelete" :
        }

        return ft;

    }
}

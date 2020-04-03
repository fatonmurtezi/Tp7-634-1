package domaine;

public class Personne {
    private String nom;
    private String prenom;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNomPrenom() {
        return nom+" "+prenom;
    }

    @Override
    public String toString() {
        return nom+" "+prenom;
    }
}
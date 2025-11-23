public class Serveur {
    private String nom;
    private int id;

    public Serveur(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void prendreCommande(Command c) {
        System.out.println("Commande prise par le serveur " + nom);
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Serveur =>" +
                "nom='" + nom + '\'' +
                ", id=" + id ;
    }

}

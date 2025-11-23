import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Command {
    private static int nextId = 1;
    private int id;
    private Client client;
    private Serveur serveur;
    private List<Plat> plats;
    private LocalDate date;

    public Command(Client client, Serveur serveur, LocalDate date) {
        this.id = nextId;
        nextId++;
        this.client = client;
        this.serveur = serveur;
        this.plats = new ArrayList<>();
        this.date = date;
    }

    public void ajouterPlat(Plat p){
        if(!plats.contains(p)) {
            plats.add(p);
        }
    }

    public double calculeTotale() {
        double total = 0.0;
        if(!plats.isEmpty()) {
            for(Plat p : plats) {
                total += p.getPrix();
            }
            return total;
        }else {
            return total;
        }

    }

    public Client getClient() {
        return client;
    }

    public Serveur getServeur() {
        return serveur;
    }

    public void afficherInfo() {
        System.out.println("Command of " + client.getNom());
        for(Plat p : plats) {
            System.out.println("- " + p.getNom());
        }
        System.out.println("=".repeat(30));
        System.out.println("=> Totale prix : " + calculeTotale() + " MAD");
        System.out.println("=".repeat(30));
    }


}

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private List<Command> commands;

    public Client(String nom) {
        this.nom = nom;
        this.commands = new ArrayList<>();
    }

    public void  passCommande(Command c) {
        if(!commands.contains(c)) {
            commands.add(c);
            System.out.println("comand pass par " + nom);
        }

    }

    public List<Command> getHistoriqueCommandes() {
        return new ArrayList<>(commands);
    }

    public String getNom() {
        return nom;
    }


    @Override
    public String toString() {
        return  "- Client nom='" + nom ;
    }
}

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurand restaurand = new Restaurand();

        Plat pizza = new Plat("Pizza Margherita", 12.50);
        Plat salade = new Plat("Salade César", 8.90);
        Plat platVegetarien = new Plat("Risotto aux champignons", 13.25, "Végétarien");

        restaurand.ajouterPlat(pizza);
        restaurand.ajouterPlat(salade);
        restaurand.ajouterPlat(platVegetarien);

        Serveur sn = new Serveur(1,"Ahmad");
        ServeurVIP sVIP = new ServeurVIP(2,"Omar");


        Client c1 = new Client("Mouad");
        Client c2 = new Client("Ali");


        restaurand.afficherMenu();

        Command com1 = new Command(c1, sn, LocalDate.of(2025,11, 22));
        com1.ajouterPlat(salade);
        com1.ajouterPlat(pizza);
        restaurand.passerComande(com1);

        com1.afficherInfo();

    }
}
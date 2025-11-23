

public class ServeurVIP extends Serveur{


    public ServeurVIP(int id, String nom) {
        super(id, nom);
    }

    public String serviceVIP() {
        return "Service VIP offert par " + getNom();
    }

    @Override
    public void prendreCommande(Command c) {
        System.out.println(serviceVIP());
    }

}

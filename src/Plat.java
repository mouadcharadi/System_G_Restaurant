

public class Plat {

    private String nom;
    private double prix;
    private String typeSprcial;
    private boolean isSpecial;

    public Plat(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
        this.typeSprcial = "";
        this.isSpecial = false;
    }

    public Plat(String nom, double prix, String typeSprcial) {
        this.nom = nom;
        this.prix = prix;
        this.typeSprcial = typeSprcial;
        this.isSpecial = true;
    }

    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public String getTypeSprcial() {
        return typeSprcial;
    }

    public boolean isSpecial() {
        return isSpecial;
    }


    @Override
    public String toString() {
        if(isSpecial) {
            return nom + " (" + typeSprcial + ") - " + prix + " MAD";
        }
        return nom + " - " + prix + " MAD";
    }
}

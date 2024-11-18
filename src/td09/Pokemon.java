package td09;

public abstract class Pokemon {
    private String nom;
    private double poids;

    Pokemon(String nom, double poids) {
        this.nom = nom;
        this.poids = Math.abs(poids);
    }

    @Override
    public String toString() {
        return "Je suis le Pokemon " + nom + ", mon poids est de " + poids + " kg, ma vitesse est de " + getVitesse() + " km/h";
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public abstract double getVitesse();
}
